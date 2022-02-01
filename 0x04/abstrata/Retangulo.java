public class Retangulo extends FormaGeometrica {

	// atributos
	protected double largura;
	protected double altura;

	// encapsulamentos
	public double getLargura() {
		return largura;
	}

	public double setLargura(double largura) {
		if (largura < 0) {
			throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
		} else {
			this.largura = largura;
		}
		return largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (altura < 0) {
			throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
		} else {
			this.altura = altura;
		}
	}

	public double area() {
		return largura * altura;
	}

	// sobrescritas
	@Override
	public String toString() {
		String frm = String.format("[Retangulo] %.2f / %.2f", largura, altura);
		return frm;
	}
}
