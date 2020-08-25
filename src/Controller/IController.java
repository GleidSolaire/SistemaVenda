package Controller;

import java.util.ArrayList;

import Model.FormaPagamento;

public interface IController<E> {

	void cadastrar(E object);
	

	
	ArrayList<E> listar();


	
	
	
	
}
