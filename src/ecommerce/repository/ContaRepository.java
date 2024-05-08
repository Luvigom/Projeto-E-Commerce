package ecommerce.repository;

import ecommerce.model.ecommerce;

public interface ContaRepository {
	
	//Crud da Ecommerce
	public void listarTodoMundo(int numero);
	public void listarPorId();
	public void Cadastrar(ecommerce ecommerce );
	public void Atualizar(ecommerce ecommerce);
	public void Deletar (int numero);
	
	//métodos logisticos 
	public void prazo (int numero);
	public void dia (String dia);
}
