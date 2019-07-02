package br.com.controle.tarefas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controle.tarefas.dto.UsuarioDTO;
import br.com.controle.tarefas.dto.UsuarioEnderecoDTO;
import br.com.controle.tarefas.modal.UsuarioEndereco;
import br.com.controle.tarefas.repository.UsuarioEnderecoRepository;

@Service
public class UsuarioEnderecoService {

	private UsuarioEnderecoRepository repository;
	
	@Autowired
	public UsuarioEnderecoService(UsuarioEnderecoRepository repository) {
		this.repository = repository;
	}

	public void salvarEnderecoUsuario(UsuarioDTO usuarioDTO, Long idUsuario) {
		if(usuarioDTO.getEnderecoDTO() != null) {
			UsuarioEndereco endereco = montarObjetoEnderecoUsuario(usuarioDTO.getEnderecoDTO(), idUsuario);
			repository.saveAndFlush(endereco);
		}
	}

	private UsuarioEndereco montarObjetoEnderecoUsuario(UsuarioEnderecoDTO enderecoDTO, Long idUsuario) {
		UsuarioEndereco endereco = new UsuarioEndereco();
		
		endereco.setIdUsuario(idUsuario);
		endereco.setDescEndereco(enderecoDTO.getEnderecoDTO());
		endereco.setNumeroEndereco(enderecoDTO.getNumeroEnderecoDTO());
		endereco.setCepEndereco(enderecoDTO.getCepDTO());
		endereco.setCidadeEndereco(enderecoDTO.getCidadeDTO());
		endereco.setUfEndereco(enderecoDTO.getUfDTO());
		endereco.setComplementoEndereco(enderecoDTO.getComplementoDTO());
		
		return endereco;
	}
	
}
