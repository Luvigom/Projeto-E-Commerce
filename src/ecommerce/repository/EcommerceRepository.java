package ecommerce.repository;

import ecommerce.model.Ecommerce;

public interface EcommerceRepository
{
	//Crud da Ecommerce
	public void listarTodos();
	public void Cadastrar(Ecommerce ecommerce );
	public void Atualizar(Ecommerce ecommerce);
	public void Deletar (int numero);
}