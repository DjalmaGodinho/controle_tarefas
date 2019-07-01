package br.com.controle.tarefas.modal;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.controle.tarefas.modal.id.UsuarioFotoId;

@Entity
@Table(name = "USUARIO_FOTO")
public class UsuarioFoto implements Serializable{

	private static final long serialVersionUID = -6208467850254555763L;

	@EmbeddedId
	private UsuarioFotoId usuarioFotoId;
	
	@Column(name = "FOTO", nullable = true)
	private Blob file;

}
