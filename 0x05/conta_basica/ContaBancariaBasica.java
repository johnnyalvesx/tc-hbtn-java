import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

	// atributos
	String numeracao;
	double saldo;
	double taxaJurosAnual;

	// construtores
	public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
		this.numeracao = numeracao;
		this.taxaJurosAnual = taxaJurosAnual;
		this.saldo = 0;
	}

	// getters
	public String getNumeracao() {
		return numeracao;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getTaxaJurosAnual() {
		return taxaJurosAnual;
	}

	// métodos
	public void depositar(double valor) throws OperacaoInvalidaException {
		if (valor <= 0) {
			throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
		} else {
			this.saldo = this.saldo + valor;
		}
	}

	public void sacar(double valor) throws OperacaoInvalidaException {
		if (valor <= 0) {
			throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
		} else if (this.saldo < valor) {
			throw new OperacaoInvalidaException("Valor de saque deve ser maior que o saldo atual");
		} else {
			this.saldo = this.saldo - valor;
		}
	}

	public double calcularTarifaMensal() {
		double valor = this.saldo * 0.10;
		return (valor > 10) ? 10 : valor;
	}

	public double calcularJurosMensal() {
		return this.saldo * ((getTaxaJurosAnual() / 100) / 12);
	}

	public void aplicarAtualizacaoMensal() {
		this.saldo = (saldo + calcularJurosMensal()) - calcularTarifaMensal();
	}
}
