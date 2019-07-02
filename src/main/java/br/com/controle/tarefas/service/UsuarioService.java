package br.com.controle.tarefas.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
		usuario = salvarUsuario(usuario);
		
		Example<Usuario> ex = Example.of(usuario);
		List<Usuario> list = repository.findAll(ex);
		
		usuarioEnderecoService.salvarEnderecoUsuario(usuarioDTO, usuario.getIdUsuario());
		
		return usuario;
	}

	@Transactional
	public Usuario salvarUsuario(Usuario usuario) {
		return repository.save(usuario);
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
		
		usuario.setIdUsuario(usuarioDTO.getIdUsuarioDTO());
		usuario.setIdCargo(usuarioDTO.getIdCargoDTO());
		usuario.setNomeUsuario(usuarioDTO.getNomeUsuarioDTO());
		
		return usuario;
	}
	
}
