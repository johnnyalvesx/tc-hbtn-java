public class InteiroPositivo {

	private int valor;
	private int result;

	public InteiroPositivo(int valor) {
		this.valor = valor;
	}

	public InteiroPositivo(String valor) {
		this.valor = Integer.valueOf(valor);
		setValor(this.valor);
	}

	public boolean ehPrimo() {
		for (int i = 1; i <= valor; i++) {
			if (valor % i == 0) {
				result++;
			}
		}

		if (result == 2) {
			return true;
		}

		return false;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		if (valor > 0) {
			this.valor = valor;
		} else {
			throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
		}
	}
}
