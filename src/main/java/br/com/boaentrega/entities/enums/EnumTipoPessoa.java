package br.com.boaentrega.entities.enums;

public enum EnumTipoPessoa {
	
	FISICA(1),JURIDICA(2);
	
	private final int valor;
	
	EnumTipoPessoa(int valorOpcao){
		valor = valorOpcao;
		}
	
	public int getValor(){
		return valor;
		}

}
