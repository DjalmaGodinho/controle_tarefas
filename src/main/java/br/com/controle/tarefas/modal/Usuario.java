package br.com.controle.tarefas.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import br.com.controle.tarefas.modal.id.UsuarioId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@IdClass(UsuarioId.class)
@Getter
@Setter
public class Usuario{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long idUsuario;
	
	@Id
	@Column(name = "id_cargo")
	private Long idCargo;
	
	@Column(name = "nome_usuario", nullable = true)
	private String nomeUsuario;
	
}
