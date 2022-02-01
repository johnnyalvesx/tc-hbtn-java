public class ContaBancariaControlada extends ContaBancariaBasica {

	// atributos
	private double saldoMinimo;
	private double valorPenalidade;

	// construtores
	public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo,
			double valorPenalidade) {
		super(numeracao, taxaJurosAnual);
		this.saldoMinimo = saldoMinimo;
		this.valorPenalidade = valorPenalidade;
	}

	// getters e setters
	public double getSaldoMinimo() {
		return saldoMinimo;
	}

	public void setSaldoMinimo(double saldoMinimo) {
		this.saldoMinimo = saldoMinimo;
	}

	public double getValorPenalidade() {
		return valorPenalidade;
	}

	public void setValorPenalidade(double valorPenalidade) {
		this.valorPenalidade = valorPenalidade;
	}

	// sobrescrita
	@Override
	public void aplicarAtualizacaoMensal() {
		if (super.getSaldo() <= getSaldoMinimo()) {
			double s = super.getSaldo() - getValorPenalidade() + super.calcularJurosMensal()
					- super.calcularTarifaMensal();
			super.setSaldo(s);
		}
	}
}
