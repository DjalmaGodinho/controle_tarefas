package br.com.controle.tarefas.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import br.com.controle.tarefas.modal.id.UsuarioEnderecoId;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USUARIO_ENDERECO")
@IdClass(UsuarioEnderecoId.class)
@Getter
@Setter
public class UsuarioEndereco implements Serializable{
	
	private static final long serialVersionUID = -6208467850254555763L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ENDERECO", nullable = false)
	private Long idEndereco;
	
	@Id
	@Column(name = "ID_USUARIO", nullable = false)
	private Long idUsuario;
	
	@Column(name = "ENDERECO", nullable = true)
	private String descEndereco;
	
	@Column(name = "NUMERO_ENDERECO", nullable = true)
	private Long numeroEndereco;
	
	@Column(name = "CEP", nullable = true)
	private Long cepEndereco;
	
	@Column(name = "CIDADE", nullable = true)
	private String cidadeEndereco;
	
	@Column(name = "UF", nullable = true)
	private String ufEndereco;
	
	@Column(name = "COMPLEMENTO", nullable = true)
	private String complementoEndereco;
	
}
