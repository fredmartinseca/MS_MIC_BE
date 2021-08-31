package br.com.boaentrega.entities.enums;

public enum EnumTipoEntidade {
	
	CLIENTE(1),FORNECEDOR(2),DEPOSITO(3);
	
	private final int valor;
	
	EnumTipoEntidade(int valorOpcao){
		valor = valorOpcao;
		}
	
	public int getValor(){
		return valor;
		}

}
