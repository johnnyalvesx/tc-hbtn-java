public class Departamento {

	// atributos
	double valorMeta;
	double valorAtingidoMeta;

	// encapsulamentos
	public double getValorMeta() {
		return valorMeta;
	}

	public double getValorAtingidoMeta() {
		return valorAtingidoMeta;
	}

	// métodos
	public Departamento(double valorMeta, double valorAtingidoMeta) {
		this.valorMeta = valorMeta;
		this.valorAtingidoMeta = valorAtingidoMeta;
	}

	public boolean alcancouMeta() {
		return getValorMeta() <= getValorAtingidoMeta();
	}
}
