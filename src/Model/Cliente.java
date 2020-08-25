package Model;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	
	String email;

	public Cliente(String nome, String cpf, String email) {
		super(nome, cpf);
		this.email = email;
	}
	


	@Override
	public String toString() {
		return "Cliente  \t nome= " + nome + "\t CPF= "+ cpf + "\t email= "+email;
	}

	
	

}
