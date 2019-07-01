package br.com.controle.tarefas.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SITUACAO")
@Getter
@Setter
public class Situacao {

	@Id
	@Column(name = "ID_SITUACAO", nullable = false)
	private Integer idSituacao;
	
	@Column(name = "DESC_SITUACAO", nullable = true)
	private String descricaoSituacao;
	
}
