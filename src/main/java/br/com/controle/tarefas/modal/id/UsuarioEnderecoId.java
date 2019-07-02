package br.com.controle.tarefas.modal.id;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioEnderecoId implements Serializable{

	private static final long serialVersionUID = 4049746172103239003L;

	private Long idEndereco;
	private Long idUsuario;
	
}
