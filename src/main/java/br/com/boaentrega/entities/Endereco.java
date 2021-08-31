package br.com.boaentrega.entities;

import java.io.Serializable;

public class Endereco implements Serializable {
	private static final long serialVersionUID = -5303733015884718139L;

	private Long idEndereco;
	private Long fkEndereco;
	private String cep;
	private String tipoVia;
	private String nomeVia;
	private Integer numVia;
	private String complementoVia;
	private String bairro;
	private String municipio;
	private String estado;
	private Double latitude;
	private Double longitude;

	public Endereco() {
	}

	public Endereco(Long fkEndereco, String cep, String tipoVia, String nomeVia, Integer numVia, String complementoVia,
			String bairro, String municipio, String estado, Double latitude, Double longitude) {
		super();
		this.fkEndereco = fkEndereco;
		this.cep = cep;
		this.tipoVia = tipoVia;
		this.nomeVia = nomeVia;
		this.numVia = numVia;
		this.complementoVia = complementoVia;
		this.bairro = bairro;
		this.municipio = municipio;
		this.estado = estado;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
	}

	public Long getFkEndereco() {
		return fkEndereco;
	}

	public void setFkEndereco(Long fkEndereco) {
		this.fkEndereco = fkEndereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTipoVia() {
		return tipoVia;
	}

	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}

	public String getNomeVia() {
		return nomeVia;
	}

	public void setNomeVia(String nomeVia) {
		this.nomeVia = nomeVia;
	}

	public Integer getNumVia() {
		return numVia;
	}

	public void setNumVia(Integer numVia) {
		this.numVia = numVia;
	}

	public String getComplementoVia() {
		return complementoVia;
	}

	public void setComplementoVia(String complementoVia) {
		this.complementoVia = complementoVia;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
