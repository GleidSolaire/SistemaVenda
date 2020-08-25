package Model;

public class Produto {
	
	String nomeProduto;
	int qtd;
	double preco;
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public Produto(String nomeProduto, int qtd, double preco) {
		super();
		this.nomeProduto = nomeProduto;
		this.qtd = qtd;
		this.preco = preco;
	}
	@Override
	public String toString() {
		return "Produto [nomeProduto=" + nomeProduto + ", qtd=" + qtd + ", preco=" + preco + "]";
	}
	
	
	
}
