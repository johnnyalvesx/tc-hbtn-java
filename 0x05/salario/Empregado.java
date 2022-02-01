public class Empregado {

	// atributos
	double salarioFixo;

	// encapsulamentos
	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	// métodos
	public Empregado(double salarioFixo) {
		setSalarioFixo(salarioFixo);
	}

	public double calcularBonus(Departamento departamento) {
		if (departamento.alcancouMeta()) {
			return salarioFixo * 0.10;
		} else {
			return 0;
		}
	}

	public double calcularSalarioTotal(Departamento departamento) {
		return calcularBonus(departamento) + getSalarioFixo();

	}
}
