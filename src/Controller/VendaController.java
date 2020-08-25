package Controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import Model.Cliente;
import Model.FormaPagamento;
import Model.Funcionario;
import Model.Produto;
import Model.Venda;
import utils.Console;

public class VendaController implements IController<Venda> {

	static ArrayList<Venda> vendas = new ArrayList<Venda>();
	
	

	@Override
	public void cadastrar(Venda venda) {
		vendas.add(venda);

	}

	@Override
	public ArrayList listar() {
		// TODO Auto-generated method stub
		return vendas;
	}
	
	
	



	

}