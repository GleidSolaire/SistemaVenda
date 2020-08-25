package View;

import java.util.ArrayList;

import Controller.ClienteController;
import Controller.FormaPagamentoController;
import Controller.FuncionarioController;
import Controller.ProdutoController;
import Controller.VendaController;
import Model.Cliente;
import Model.FormaPagamento;
import Model.Funcionario;
import Model.ItemVenda;
import Model.Produto;
import Model.Venda;
import utils.Console;

public class Main {

	static FormaPagamentoController fp = new FormaPagamentoController();
	static ClienteController cl = new ClienteController();
	static ProdutoController pd = new ProdutoController();
	static VendaController vd = new VendaController();
	static FuncionarioController fc = new FuncionarioController();

	public static void main(String[] args) {

		System.out.println("-- BEM VINDO AO SISTEMA -- \n");

		String[] Menu = { "Cadastrar Cliente", "Listar Clientes", "Cadastrar Funcionario", "Listar Funcionarios",
				"Cadastrar Produto", "Cadastrar Forma de Pagamento", "Cadastrar Venda", "Listar Vendas" };
		boolean con = true;
		do {

			int opc = Console.mostrarMenu(Menu, "", "voltar");

			switch (opc) {
			case 1:

				String nome = Console.recuperaTexto("Informe o nome do cliente: ");

				String email = Console.recuperaTexto("Informe o email do cliente: ");

				String cpf = Console.recuperaTexto("Informe o CPF do cliente: ");

				Cliente cliente = new Cliente(nome, cpf, email);
				cl.cadastrar(cliente);

				break;

			case 2:
				System.out.println(" --- Listando os clientes... ");
				System.out.println(cl.listar());

				break;

			case 3:

				nome = Console.recuperaTexto("Informe o nome do Funcionário: ");
				cpf = Console.recuperaTexto("Informe o CPf do funcionário");
				String matricula = Console.recuperaTexto("Informe o número de matrícula: ");
				double salario = Console.recuperaDecimal("Informe o valor do salário do funcionário R$: ");
				Funcionario funcionario = new Funcionario(nome, cpf, salario, matricula);
				fc.cadastrar(funcionario);

				break;

			case 4:

				System.out.println(fc.listar());

				break;

			case 5:

				nome = Console.recuperaTexto("Informe o nome do produto: ");
				int qtd = Console.recuperaInteiro("Informe a quantidade desse produto: ");
				double preco = Console.recuperaDecimal("Informe o preço unitário desse produto: ");
				Produto produto = new Produto(nome, qtd, preco);

				pd.cadastrar(produto);
				System.out.println(pd.listar());

				break;

			case 6:
				String texto = Console.recuperaTexto("Informe a forma de pagamento");

				FormaPagamento forma = new FormaPagamento(texto);

				fp.cadastrar(forma);

				break;

			case 7:
				
				Venda venda = new Venda();
				ArrayList<ItemVenda> itens = new ArrayList<ItemVenda>();
			
				String funcionariovenda = Console.recuperaTexto("Identifique o funcionário: ");
				
			
				if (fc.VerificaFuncionario(funcionariovenda) == true) {
					
			
					String clientevenda = Console.recuperaTexto("Identifique o cliente:  ");

					if (cl.VerificaIdentidade(clientevenda) == true) {

		
						
						String produtovenda = Console.recuperaTexto("Informe o produto: ");

						int quantidadeproduto = Console.recuperaInteiroPositivo("Informe a quantidade: ");
						
						    if (pd.ValidaProduto(produtovenda, quantidadeproduto) == true) {

							String pagamentovenda = Console.recuperaTexto("Informe o método de pagamento");
						
					//		ItemVenda item = new ItemVenda(, quantidadeproduto);

						 //    itens.add(item);
						     
						     venda.setItens(itens);

							   if (fp.ValidaPagamento(pagamentovenda) == false) {

								 System.out.println("Forma de pagamento não encontrada! ");
								 
							
							  }

						} else {

							System.out.println("Produto não encontrado ou estoque inferior a quantidade a comprar");
						}

					} else {
						System.out.println("Cliente não encontrado");
					}

				} else {
					System.out.println("Funcionário não encontrado! ");
				}

				

				vd.cadastrar(venda);

				break;

			case 8:

				System.out.println(vd.listar());

				break;

			case -1:
				System.out.println("Saindo do sistema");
				con = false;
				break;
			}

		} while (con);

	}

}
