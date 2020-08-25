package Controller;

import java.util.ArrayList;

import Model.Cliente;
import utils.Console;

public class ClienteController implements IController<Cliente> {
	
	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	



@Override
public void cadastrar(Cliente c) {

int i = encontrarCpf(c);

if (i == -1) {
	clientes.add(c);
	Console.MensagemGenericaSucesso();
} else {
	Console.MensagemGenericaErro();
}
	
	
}





@Override
public ArrayList listar() {
	// TODO Auto-generated method stub
	return clientes;
}



private static int encontrarCpf(Cliente c) {

int i = -1;
for (Cliente cadastrados : clientes) {
	i++;
	if (cadastrados.getCpf().equalsIgnoreCase(c.getCpf())) {
		return i;
	}
}
return -1;
}



public boolean VerificaIdentidade(String nomecliente) {


	for (Cliente cliente : clientes) {

		if (nomecliente.equals(cliente.getNome())) {
			return true;
		}
	}

	return false;

}

}
