package br.com.controle.tarefas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.controle.tarefas.dto.UsuarioDTO;
import br.com.controle.tarefas.dto.UsuarioEnderecoDTO;
import br.com.controle.tarefas.modal.UsuarioEndereco;
import br.com.controle.tarefas.modal.id.UsuarioEnderecoId;
import br.com.controle.tarefas.modal.id.UsuarioId;
import br.com.controle.tarefas.repository.UsuarioEnderecoRepository;

@Service
public class UsuarioEnderecoService {

	private UsuarioEnderecoRepository repository;
	
	@Autowired
	public UsuarioEnderecoService(UsuarioEnderecoRepository repository) {
		this.repository = repository;
	}

	public void salvarEnderecoUsuario(UsuarioDTO usuarioDTO, UsuarioId usuarioId) {
		if(usuarioDTO.getEnderecoDTO() != null) {
			UsuarioEndereco endereco = montarObjetoEnderecoUsuario(usuarioDTO.getEnderecoDTO(), usuarioId);
			repository.saveAndFlush(endereco);
		}
	}

	private UsuarioEndereco montarObjetoEnderecoUsuario(UsuarioEnderecoDTO enderecoDTO, UsuarioId usuarioId) {
		UsuarioEndereco endereco = new UsuarioEndereco();
		UsuarioEnderecoId enderecoId = montarObjetoEnderecoUsuarioId(usuarioId);
		
		endereco.setUsuarioEnderecoId(enderecoId);
		endereco.setDescEndereco(enderecoDTO.getEnderecoDTO());
		endereco.setNumeroEndereco(enderecoDTO.getNumeroEndereco());
		endereco.setCepEndereco(enderecoDTO.getCepDTO());
		endereco.setCidadeEndereco(enderecoDTO.getCidadeDTO());
		endereco.setUfEndereco(enderecoDTO.getUf());
		endereco.setComplementoEndereco(enderecoDTO.getComplemento());
		
		return endereco;
	}

	private UsuarioEnderecoId montarObjetoEnderecoUsuarioId(UsuarioId usuarioId) {
		UsuarioEnderecoId enderecoId = new UsuarioEnderecoId();
		enderecoId.setIdUsuario(usuarioId.getIdUsuario());
		return enderecoId;
	}
	
}
