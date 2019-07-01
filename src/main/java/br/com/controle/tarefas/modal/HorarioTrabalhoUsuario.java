package br.com.controle.tarefas.modal;

import java.io.Serializable;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.controle.tarefas.modal.id.HorarioTrabalhoUsuarioId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "HORARIO_TRABALHO_USUARIO")
@Getter
@Setter
public class HorarioTrabalhoUsuario implements Serializable{
	
	private static final long serialVersionUID = -6208467850254555763L;
	
	@EmbeddedId
	private HorarioTrabalhoUsuarioId horaTrabalhoUsuarioId;
	
	@Column(name = "DIA_SEMANA", nullable = true)
	private Integer diaSemana;
	
	@Column(name = "DESC_DIA_SEMANA", nullable = true)
	private String descDiaSemana;
	
	@Column(name = "HORA_ENTRADA", nullable = true)
	private LocalTime horaEntrada;
	
	@Column(name = "HORA_SAIDA", nullable = true)
	private LocalTime horaSaida;
	
}
