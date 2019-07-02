package br.com.controle.tarefas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioEnderecoDTO {

	private Long idUsuarioDTO;
	private Long numeroEnderecoDTO;
	private Long cepDTO;
	
	private String enderecoDTO;
	private String cidadeDTO;
	private String ufDTO;
	private String complementoDTO;
}
