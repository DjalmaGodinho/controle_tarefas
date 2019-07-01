package br.com.controle.tarefas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioEnderecoDTO {

	private Integer idUsuarioDTO;
	private Integer numeroEndereco;
	private Integer cepDTO;
	
	private String enderecoDTO;
	private String cidadeDTO;
	private String uf;
	private String complemento;
}
