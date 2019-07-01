package br.com.controle.tarefas.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.controle.tarefas.modal.id.UsuarioId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
public class Usuario implements Serializable{

	private static final long serialVersionUID = -6208467850254555763L;
	
	@EmbeddedId
	private UsuarioId usuarioId;
	
	@Column(name = "NOME_USUARIO", nullable = true)
	private String nomeUsuario;
	
}
