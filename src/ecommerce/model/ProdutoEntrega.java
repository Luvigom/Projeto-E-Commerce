package ecommerce.model;

import ecommerce.Cores;

public class ProdutoEntrega extends ecommerce {

	private int prazo;

	public ProdutoEntrega(int identificador, int tipo, String titular, int prazo) {
		super(identificador, tipo, titular);
		this.prazo = prazo;
		// TODO Auto-generated constructor stub
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println(Cores.TEXT_GREEN + "         Prazo de entrega: " + this.prazo + "\n" + Cores.TEXT_RESET );

	}
}