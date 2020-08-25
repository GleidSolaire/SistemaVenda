package Controller;

import java.util.ArrayList;

import Model.Cliente;
import Model.Funcionario;
import utils.Console;

public class FuncionarioController implements IController<Funcionario> {
	
	public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	



@Override
public void cadastrar(Funcionario f) {

int i = encontrarCpf(f);

if (i == -1) {
	funcionarios.add(f);
	Console.MensagemGenericaSucesso();
} else {
	Console.MensagemGenericaErro();
}
	
	
}





@Override
public ArrayList listar() {
	// TODO Auto-generated method stub
	return funcionarios;
}



private static int encontrarCpf(Funcionario f) {

int i = -1;
for (Funcionario cadastrados : funcionarios) {
	i++;
	if (cadastrados.getCpf().equalsIgnoreCase(f.getCpf())) {
		return i;
	}
}
return -1;
}



public boolean VerificaFuncionario (String matricula) {
	

	
	for (Funcionario funcionario : funcionarios) {
		
		if(matricula.equals(funcionario.getMatricula())) {
			return true;
		}
	}
	
	
	
	return false;
	
	
	
}




}
