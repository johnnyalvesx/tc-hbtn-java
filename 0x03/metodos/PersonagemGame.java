public class PersonagemGame {
	public int saudeAtual = 0;
	public String nome = "";

	public int getSaudeAtual() {
		return saudeAtual;
	}

	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = saudeAtual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void tomarDano(int quantidadeDeDano) {
		int result = this.saudeAtual - quantidadeDeDano;
		setSaudeAtual(Math.max(result, 0));
	}

	public void receberCura(int quantidadeDeCura) {
		int result = this.saudeAtual + quantidadeDeCura;
		setSaudeAtual(Math.min(result, 100));
	}
}
