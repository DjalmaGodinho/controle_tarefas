package br.com.controle.tarefas.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CARGO")
@Getter
@Setter
public class Cargo {

	@Id
	@Column(name = "ID_CARGO", nullable = false)
	private Integer idCargo;
	
	@Column(name = "DESCRICAO_CARGO", nullable = false)
	private String descricaoCargo;
	
}
