public class Gerente extends Empregado {

	// atributos
	public double salarioFixo;

	// construtores
	public Gerente(double salarioFixo) {
		super(salarioFixo);
		setSalarioFixo(salarioFixo);
	}

	// encapsulamentos
	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	// métodos
	public double calcularSalarioTotal(Departamento departamentoEngenharia) {
		return calcularBonus(departamentoEngenharia) + getSalarioFixo();
	}

	@Override
	public double calcularBonus(Departamento departamentoEngenharia) {
		if (departamentoEngenharia.alcancouMeta()) {
			return salarioFixo * 0.20
					+ (0.01 * (departamentoEngenharia.getValorAtingidoMeta() - departamentoEngenharia.getValorMeta()));
		} else {
			return 0;
		}
	}
}
