package br.com.controle.tarefas.modal.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class UsuarioId {

	@Column(name = "ID_USUARIO")
	private Integer idUsuario;
	
	@Column(name = "ID_CARGO")
	private Integer idCargo;

}
