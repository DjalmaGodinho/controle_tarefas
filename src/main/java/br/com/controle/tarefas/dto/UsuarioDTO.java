package br.com.controle.tarefas.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDTO {

	private Long idUsuarioDTO;
	private Long idCargoDTO;
	
	private String nomeUsuarioDTO;
	
	private UsuarioEnderecoDTO enderecoDTO;
	
}
