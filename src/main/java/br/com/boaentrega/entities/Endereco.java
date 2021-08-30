package br.com.boaentrega.entities;

import java.io.Serializable;

public class Endereco implements Serializable{
	private static final long serialVersionUID = -5303733015884718139L;
	
	private Long idEndereco;
	private Long fkEndereco;
	private String cep;
	private String tipoVia;
	private String nomeVia;
	private Integer numVia;
	private String complementoVia;
}
