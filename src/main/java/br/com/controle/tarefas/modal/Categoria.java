package br.com.controle.tarefas.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CATEGORIA")
@Getter
@Setter
public class Categoria {

	@Id
	@Column(name = "ID_CATEGORIA", nullable = false)
	private Integer idCategoria;
	
	@Column(name = "DESC_CATEGORIA", nullable = true)
	private Integer descricaoCategoria;

}
