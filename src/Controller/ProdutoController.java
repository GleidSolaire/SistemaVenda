package Controller;

import java.util.ArrayList;

import Model.Produto;
import Model.Cliente;

import utils.Console;

public class ProdutoController implements IController<Produto> {
	
	static ArrayList<Produto> produtos = new ArrayList<Produto>();

	

	@Override
	public void cadastrar(Produto p) {
		
		int i = encontrarProduto(p);
		
		if(i == -1) {
			produtos.add(p);
			Console.MensagemGenericaSucesso();
		} else {
			Console.MensagemGenericaErro();
		}
		
		
		
		
	}


	
	
public boolean ValidaProduto (String item, int quantidade) {
	
	ArrayList<Produto> produtos = new ArrayList<Produto>();
	
	
	for (Produto produto : produtos) {
		
		if(item.equalsIgnoreCase(produto.getNomeProduto())) {
			
			if (quantidade <= produto.getQtd()) {
				
				return true;
			}
		}
	}
	
	return false;	
  }




	@Override
	public ArrayList<Produto> listar() {
		// TODO Auto-generated method stub
		return produtos;
	}

	
	
	private static int encontrarProduto(Produto produto) {

		int i = -1;
		for (Produto cadastrado : produtos) {
			i++;
			if (cadastrado.getNomeProduto().equalsIgnoreCase(produto.getNomeProduto())) {
				return i;
			}
		}
		return -1;
	}

	
}
