package br.com.controle.tarefas.modal.id;

import java.io.Serializable;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioId implements Serializable{

	private static final long serialVersionUID = 8773067489827123635L;

	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	
	@Column(name = "ID_CARGO")
	private Long idCargo;

}
