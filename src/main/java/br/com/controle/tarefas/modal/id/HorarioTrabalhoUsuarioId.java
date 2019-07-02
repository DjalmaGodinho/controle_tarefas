package br.com.controle.tarefas.modal.id;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class HorarioTrabalhoUsuarioId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "ID_HORA_TRABALHO", nullable = false)
	private Integer idHoraTrabalho;
	
	@Column(name = "ID_USUARIO", nullable = false)
	private Integer idUsuario;
	
}
