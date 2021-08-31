package br.com.boaentrega.entities;

import java.io.Serializable;

public class Telefone implements Serializable {
	private static final long serialVersionUID = -3741947982747634810L;

	private String IdTelefone;
	private String codPais;
	private String dddTelefone;
	private String numTelefone;

	public Telefone() {
	}

	public Telefone(String idTelefone, String codPais, String dddTelefone, String numTelefone) {
		super();
		IdTelefone = idTelefone;
		this.codPais = codPais;
		this.dddTelefone = dddTelefone;
		this.numTelefone = numTelefone;
	}

	public String getIdTelefone() {
		return IdTelefone;
	}

	public void setIdTelefone(String idTelefone) {
		IdTelefone = idTelefone;
	}

	public String getCodPais() {
		return codPais;
	}

	public void setCodPais(String codPais) {
		this.codPais = codPais;
	}

	public String getDddTelefone() {
		return dddTelefone;
	}

	public void setDddTelefone(String dddTelefone) {
		this.dddTelefone = dddTelefone;
	}

	public String getNumTelefone() {
		return numTelefone;
	}

	public void setNumTelefone(String numTelefone) {
		this.numTelefone = numTelefone;
	}

}
