package ecommerce.model;

import ecommerce.Cores;

public class ProdutoRetirada extends ecommerce {

	private String dia;

	public ProdutoRetirada(int identificador, int tipo, String titular, String dia) {
		super(identificador, tipo, titular);
		this.dia = dia;
		// TODO Auto-generated constructor stub

	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println(Cores.TEXT_GREEN + "         Dia de Retirada: " + this.dia + Cores.TEXT_RESET);
	}
}
