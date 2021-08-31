package br.com.boaentrega.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import br.com.boaentrega.entities.enums.EnumTipoEntidade;
import br.com.boaentrega.entities.enums.EnumTipoPessoa;

public class Entidade implements Serializable {
	private static final long serialVersionUID = -5436427076028257302L;
	
	private Long idClient;
	private String firstName;
	private String fullName;
	private String razaoSocial;
	private String nomeFantasia;
	private String cpfCnpj;
	private Set<Endereco> enderecos = new HashSet<Endereco>();
	private Set<Telefone> telefones = new HashSet<Telefone>();
	private EnumTipoPessoa tipoPessoa;
	private EnumTipoEntidade tipoEntidade;

	public Entidade(Long idClient, String firstName, String fullName, String razaoSocial, String nomeFantasia,
			String cpfCnpj, EnumTipoPessoa tipoPessoa, EnumTipoEntidade tipoEntidade) {
		this.idClient = idClient;
		this.firstName = firstName;
		this.fullName = fullName;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cpfCnpj = cpfCnpj;
		this.tipoPessoa = tipoPessoa;
		this.tipoEntidade = tipoEntidade;
	}

	public Entidade() {
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public Set<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(HashSet<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Set<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(Set<Telefone> telefones) {
		this.telefones = telefones;
	}

	public EnumTipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(EnumTipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public EnumTipoEntidade getTipoEntidade() {
		return tipoEntidade;
	}

	public void setTipoEntidade(EnumTipoEntidade tipoEntidade) {
		this.tipoEntidade = tipoEntidade;
	}

}
