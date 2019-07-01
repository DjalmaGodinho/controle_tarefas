package br.com.controle.tarefas.modal.id;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class UsuarioEnderecoId {

	@Column(name = "ID_ENDERECO", nullable = false)
	private Integer idEndereco;
	
	@Column(name = "ID_USUARIO", nullable = false)
	private Integer idUsuario;
}
