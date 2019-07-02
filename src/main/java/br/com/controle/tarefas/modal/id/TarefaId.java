package br.com.controle.tarefas.modal.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class TarefaId implements Serializable{

	@Column(name = "ID_TAREFA")
	private Integer idTarega;
	
	@Column(name = "ID_USUARIO")
	private Integer idUsuario;
	
	@Column(name = "ID_CATEGORIA")
	private Integer idCategoria;
	
	@Column(name = "ID_SITUACAO")
	private Integer idSituacao;
	
}
