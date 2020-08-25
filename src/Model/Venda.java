package Model;

import java.util.ArrayList;

public class Venda {

	Cliente cliente;
	Funcionario funcionario;
	FormaPagamento formaPagamento;
	ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
	double ValorTotal;
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public ArrayList<ItemVenda> getItens() {
		return itens;
	}
	public void setItens(ArrayList<ItemVenda> itens) {
		this.itens = itens;
	}
	public double getValorTotal() {
		return ValorTotal;
	}
	public void setValorTotal(double valorTotal) {
		ValorTotal = valorTotal;
	}

	public Venda(Cliente cliente, Funcionario funcionario, FormaPagamento formaPagamento, ArrayList<ItemVenda> itens,
			double valorTotal) {
		super();
		this.cliente = cliente;
		this.funcionario = funcionario;
		this.formaPagamento = formaPagamento;
		this.itens = itens;
		ValorTotal = valorTotal;

	}
	
	
	
public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}
	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
public Venda() {
		
	}
	
	@Override
	public String toString() {
		return "Venda [cliente=" + cliente + ", funcionario=" + funcionario + ", formaPagamento=" + formaPagamento
				+ ", itens=" + itens + ", ValorTotal=" + ValorTotal +"]";
	}

	


}
