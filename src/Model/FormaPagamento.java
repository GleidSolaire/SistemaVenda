package Model;

public class FormaPagamento {

	String nomeFp;

	public FormaPagamento(String nome) {
		this.nomeFp = nome;
	}

	public String getNomeFp() {
		return nomeFp;
	}

	public void setNomeFp(String nomeFp) {
		this.nomeFp = nomeFp;
	}

	@Override
	public String toString() {
		return "FormaPagamento: " + nomeFp ;
	}
	
	
}
