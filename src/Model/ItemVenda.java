package Model;

public class ItemVenda {

	Produto produto;
	int quantidade;
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public ItemVenda(Produto produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	} 
	
	
}
