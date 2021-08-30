package br.com.boaentrega.entities;

import java.io.Serializable;

import br.com.boaentrega.entities.enums.EnumCodPais;

public class Telefone implements Serializable{
	private static final long serialVersionUID = -3741947982747634810L;
	
	private Long IdTelefone;
	private EnumCodPais codPais;
	private Long dddTelefone;
	private Long numTelefone;

}
