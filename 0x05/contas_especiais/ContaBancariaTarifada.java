import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada extends ContaBancariaBasica {

	// atributos
	private int quantidadeTransacoes;

	// construtores
	public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
		super(numeracao, taxaJurosAnual);
	}

	// sobrescrita
	@Override
	public void depositar(double deposito) throws OperacaoInvalidaException {
		double imp = deposito - 0.1;
		super.depositar(imp);
	}

	@Override
	public void sacar(double saque) {
		saldo = saldo - saque - 0.1;
	}

	public int getQuantidadeTransacoes() {
		return quantidadeTransacoes = quantidadeTransacoes + 1;
	}
}
