package Model;

public class Funcionario extends Pessoa {

	double salario;
	String matricula;
	double comissao;
	public Funcionario(String nome, String cpf, double salario, String matricula) {
		super(nome, cpf);
		this.salario = salario;
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		return "Funcionario [salario=" + salario + ", comissao=" + comissao + ", nome=" + nome + ", cpf=" + cpf + "]";
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	  
	
}
