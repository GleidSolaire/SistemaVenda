package Controller;

import java.util.ArrayList;
import java.util.Iterator;

import Model.FormaPagamento;
import Model.Produto;
import utils.Console;

public class FormaPagamentoController implements IController<FormaPagamento> {
	static ArrayList<FormaPagamento> formas = new ArrayList<FormaPagamento>();


	
	@Override
	public void cadastrar(FormaPagamento f) {

		int i = encontrarForma(f);

		if (i == -1) {
			formas.add(f);
			 
			Console.MensagemGenericaSucesso();
		} else {
			Console.MensagemGenericaErro();
		}

	}

	private static int encontrarForma(FormaPagamento forma) {

		int i = -1;
		for (FormaPagamento formascadastradas : formas) {
			i++;
			if (formascadastradas.getNomeFp().equalsIgnoreCase(forma.getNomeFp())) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean ValidaPagamento (String pagamento) {
		
		
		
		
		for (FormaPagamento forma : formas) {
			
			if(pagamento.equalsIgnoreCase(forma.getNomeFp())) {
				return true;
		
		}
		
		
	  }
		return false;
	}

	@Override
	public ArrayList<FormaPagamento> listar() {
		// TODO Auto-generated method stub
		return formas;
	}
}
