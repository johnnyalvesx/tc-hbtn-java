public class Quadrado extends Retangulo {
	// atributo
	private double lado;

	// encapsulamentos
	public double getLado() {
		return setLargura(lado);
	}

	public void setLado(double lado) {
		if (lado < 0) {
			throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
		} else {
			this.lado = lado;
		}
	}

	// sobrescritas
	@Override
	public double area() {
		setLado(getLado());
		super.altura = getLado();
		super.largura = getLargura();
		return super.altura * super.largura;
	}

	@Override
	public String toString() {
		return String.format("[Quadrado] %.02f", lado);
	}
}
