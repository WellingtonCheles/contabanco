
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		int loop = 10;

		Scanner sc = new Scanner(System.in);

		while (loop != 0) {

			System.out.println("\n###### Conta Bancária ###### \n");
			System.out.println("Digite 1 para abrir Conta Corrente!");
			System.out.println("Digite 2 para abrir Conta Poupança!");
			System.out.println("Digite 3 para abrir Conta Conjunta!");
			System.out.println("Digite 4 para creditar!");
			System.out.println("Digite 5 para debitar!");			
			System.out.println("Digite 6 para consultar o saldo!");
			System.out.println("Digite 7 para encerrar a conta!!");
			System.out.println("Digite 0 para encerrar a operação!!");
			System.out.println("\n###### Conta Bancária ###### \n");
			

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {

			case 1:

				ContaCorrente cc = new ContaCorrente();

				System.out.println("Para abertura da sua Conta Corrente nos informe algumas informações: ");
				System.out.print("Digite o seu nome: ");
				String nome = sc.next();
				cc.setNome1(nome);
				cc.abrirConta();

				break;

			case 2:

				ContaPoupanca cp = new ContaPoupanca();

				System.out.println("Para abertura da sua Conta Corrente nos informe algumas informações: ");
				System.out.print("Digite o seu nome: ");
				String nomex = sc.next();
				cp.setNome1(nomex);
				cp.abrirConta();

				break;

			case 3:

				ContaConjunta con = new ContaConjunta();

				System.out.println("Para abertura da sua Conta Corrente nos informe algumas informações: ");
				System.out.print("Digite o nome do titular principal: ");
				String nomey = sc.next();
				con.setNome1(nomey);
				System.out.print("Digite o segundo nome da conta conjunta: ");
				String nomez = sc.next();
				con.setNome2(nomez);
				con.abrirConta();

				break;

			case 4:

				System.out.println("Informe o tipo da conta para creditar!");
				System.out.println("Digite 1 -> Conta corrente");
				System.out.println("Digite 2 -> Conta poupança");
				System.out.println("Digite 3 -> Conta conjunta");
				System.out.println("Digite 0 -> Sair");

				Integer tipo = sc.nextInt();

				switch (tipo) {

				case 1:

					ContaCorrente c = new ContaCorrente();

					System.out.println("Digite o valor!");

					Double valor = sc.nextDouble();

					c.setSaldo(valor);
					c.creditar();
					
					
					break;

				case 2:

					ContaPoupanca cp2 = new ContaPoupanca();

					System.out.println("Digite o valor!");

					Double valor2 = sc.nextDouble();

					cp2.setSaldo(valor2);
					
					
					break;

				case 3:

					ContaConjunta con2 = new ContaConjunta();

					System.out.println("Digite o valor!");

					Double valor3 = sc.nextDouble();

					con2.setSaldo(valor3);
					
					
					break;
					
					

				default:

					break;

				}
				
			break;

			case 5:

				System.out.println("Informe o tipo da conta para debitar!");
				System.out.println("Digite 1 -> Conta corrente");
				System.out.println("Digite 2 -> Conta poupança");
				System.out.println("Digite 3 -> Conta conjunta");
				System.out.println("Digite 0 -> Sair");

				int tipo1 = sc.nextInt();

				switch (tipo1) {

				case 1:

					ContaCorrente c = new ContaCorrente();

					System.out.println("Digite o valor!");

					Double valor = sc.nextDouble();

					c.debitar(valor);
					
					break;

				case 2:

					ContaPoupanca cp2 = new ContaPoupanca();

					System.out.println("Digite o valor!");

					Double valor2 = sc.nextDouble();

					cp2.debitar(valor2);
					
					break;

				case 3:

					ContaConjunta con2 = new ContaConjunta();

					System.out.println("Digite o valor!");

					Double valor3 = sc.nextDouble();

					con2.debitar(valor3);
					
					break;

				default:

					break;

				}
				
			break;
			
			case 6:

				System.out.println("Informe o tipo da conta para consultar o saldo!");
				System.out.println("Digite 1 -> Conta corrente");
				System.out.println("Digite 2 -> Conta poupança");
				System.out.println("Digite 3 -> Conta conjunta");
				System.out.println("Digite 0 -> Sair");

				int tipo3 = sc.nextInt();

				switch (tipo3) {

				case 1:

					ContaCorrente c = new ContaCorrente();
					
					c.getSaldo();
					
					break;

				case 2:

					ContaPoupanca cp2 = new ContaPoupanca();

					cp2.getSaldo();
					
					break;

				case 3:

					ContaConjunta con2 = new ContaConjunta();

					con2.getSaldo();
					
					break;
				
				default:

					System.out.println("Opção incorreta!!");

				}
				
			
			break;


			case 7:

				ContaBanco c = new ContaBanco();

			
			case 0:

				System.out.println("Acesso encerrado com sucesso!!!");

				System.exit(0); // Força a parada da execução.
				sc.close();

				break;

			default:

				System.out.println("Opção incorreta!!");

			}

		}

	}

}
