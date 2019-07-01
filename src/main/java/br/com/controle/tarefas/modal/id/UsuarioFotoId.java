package br.com.controle.tarefas.modal.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class UsuarioFotoId {

	@Column(name = "ID_FOTO")
	private Integer idFoto;	
	
	@Column(name = "ID_USUARIO")
	private Integer idUsuario;
	
}
