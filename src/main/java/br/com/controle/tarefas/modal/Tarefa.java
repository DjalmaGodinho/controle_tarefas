package br.com.controle.tarefas.modal;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.controle.tarefas.modal.id.TarefaId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TAREFA")

@Getter
@Setter
public class Tarefa implements Serializable{

	private static final long serialVersionUID = -6208467850254555763L;
	
	@EmbeddedId
	private TarefaId tarefaId;
	
	@Column(name = "DESC_TAREFA")
	private String descricaoTarefa;
	
	@Column(name = "TEMPO_TAREFA")
	private LocalTime tempoTarefa;
	
}
