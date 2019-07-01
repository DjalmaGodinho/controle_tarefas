package br.com.controle.tarefas.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.controle.tarefas.modal.id.UsuarioEnderecoId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USUARIO_ENDERECO")
@Getter
@Setter
public class UsuarioEndereco implements Serializable{
	
	private static final long serialVersionUID = -6208467850254555763L;

	@EmbeddedId
	private UsuarioEnderecoId usuarioEnderecoId;
	
	@Column(name = "ENDERECO", nullable = false)
	private String descEndereco;
	
	@Column(name = "NUMERO_ENDERECO", nullable = false)
	private Integer numeroEndereco;
	
	@Column(name = "CEP", nullable = false)
	private Integer cepEndereco;
	
	@Column(name = "CIDADE", nullable = false)
	private String cidadeEndereco;
	
	@Column(name = "UF", nullable = false)
	private String ufEndereco;
	
	@Column(name = "COMPLEMENTO", nullable = false)
	private String complementoEndereco;
	
}
