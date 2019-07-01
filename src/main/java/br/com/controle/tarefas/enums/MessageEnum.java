package br.com.controle.tarefas.enums;

import br.com.controle.tarefas.utils.Constantes;

public enum MessageEnum {

	ID_USUARIO_OBRIGATORIO(Constantes.ID_USUARIO_OBRIGATORIO),
	ID_CARGO_OBRIGATORIO(Constantes.ID_CARGO_OBRIGATORIO),
	ID_CATEGORIA_OBRIGATORIO(Constantes.ID_CATEGORIA_OBRIGATORIO);
	
	private String value;
	private Integer codigo;
	private Long codigoLong;
	private Double valor;

	MessageEnum() {
	}
	
	MessageEnum(String value) {
		this.value = value;
	}
	
	MessageEnum(Double valor) {
		this.valor = valor;
	}
	
	MessageEnum(Integer codigo) {
		this.codigo = codigo;
	}
	
	MessageEnum(Long codigoLong) {
		this.codigoLong = codigoLong;
	}

	public String getValue() {
		return this.value;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public Long getCodigolong() {
		return this.codigoLong;
	}
	
	public Double getValor() {
		return this.valor;
	}
	
}
