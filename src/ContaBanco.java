
public class  ContaBanco {

	private double saldo;
	private boolean situacao;
	private String nome1;
	private String nome2;
	private Double creditar;
	
	

	public ContaBanco() {

		this.saldo = saldo;
		this.situacao = false;
		this.nome1 = nome1;
		this.nome2 = nome2;
	}

	public double getSaldo() {
		
		System.out.println("O seu saldo atual é de: R$ " + saldo);
		
		return saldo;
	}

	public void setSaldo(double valor) {
		this.saldo = saldo + valor;
	}

	public boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}
	

	public String getNome1() {
		return nome1;
	}

	public String getNome2() {
		return nome2;
	}

	public void setNome1(String nome1) {
		this.nome1 = nome1;
	}

	public void setNome2(String nome2) {
		this.nome2 = nome2;
	}
	

	public Double getCreditar() {
		return creditar;
	}

	public void setCreditar(Double creditar) {
		this.creditar = creditar;
	}

	public void abrirConta() {

		if (getSituacao() == false) {

			this.setSituacao(true);
			this.setSaldo(0);

			System.out.println("Conta aberta com sucesso!!");

		}

	}

	public void creditar() {

		
			saldo = saldo + saldo;

			System.out.println("Valor creditado com sucesso!!");


	}

	public void debitar(double valor) {

		if (getSaldo() >= valor) {

			saldo = saldo - valor;

			System.out.println("Valor debitado com sucesso!");

		} 
		
		else {

			System.out.println("Saldo insuficiente!!");
		}

	}
	

	public void encerrar() {

		if (getSituacao() == true && getSaldo() > 0) {

			System.out.println("Por favor debitar o saldo restaste que é de: R$ " + getSaldo());

		}

		else if (getSituacao() == true && getSaldo() == 0) {

			setSituacao(false);

			System.out.println("Conta encerrada com sucesso!!");

		}

	}

}