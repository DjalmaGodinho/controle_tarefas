package br.com.controle.tarefas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controle.tarefas.dto.UsuarioDTO;
import br.com.controle.tarefas.enums.MessageEnum;
import br.com.controle.tarefas.handler.ControleTarefasException;
import br.com.controle.tarefas.modal.Usuario;
import br.com.controle.tarefas.modal.id.UsuarioId;
import br.com.controle.tarefas.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private UsuarioRepository repository;
	private UsuarioEnderecoService usuarioEnderecoService;
	
	@Autowired
	public UsuarioService(UsuarioRepository repository, UsuarioEnderecoService usuarioEnderecoService) {
		this.repository = repository;
		this.usuarioEnderecoService = usuarioEnderecoService;
	}

	public List<Usuario> findAllUsuarios() {
		return repository.findAll();
	}

	public Usuario incluirUsuario(UsuarioDTO usuarioDTO) throws ControleTarefasException {
		validarDTO(usuarioDTO, true);
		
		Usuario usuario = montarObjetoUsuario(usuarioDTO);
		usuario = repository.saveAndFlush(usuario);
		
		usuarioEnderecoService.salvarEnderecoUsuario(usuarioDTO, usuario.getUsuarioId());
		
		return usuario;
	}

	private void validarDTO(UsuarioDTO usuarioDTO, boolean isIncluirUsuario) throws ControleTarefasException {
		
		if(usuarioDTO.getIdUsuarioDTO() == null && !isIncluirUsuario) {
			throw new ControleTarefasException(MessageEnum.ID_USUARIO_OBRIGATORIO.getValue());
		}
		
		if(usuarioDTO.getIdCargoDTO() == null) {
			throw new ControleTarefasException(MessageEnum.ID_CARGO_OBRIGATORIO.getValue());
		}
		
	}
	
	private Usuario montarObjetoUsuario(UsuarioDTO usuarioDTO) {
		Usuario usuario = new Usuario();
		UsuarioId usuarioId = new UsuarioId();
		
		usuarioId.setIdUsuario(usuarioDTO.getIdUsuarioDTO());
		usuarioId.setIdCargo(usuarioDTO.getIdCargoDTO());
		usuario.setUsuarioId(usuarioId);
		usuario.setNomeUsuario(usuarioDTO.getNomeUsuarioDTO());
		
		return usuario;
	}
	
}
