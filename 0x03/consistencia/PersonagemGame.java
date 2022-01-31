public class PersonagemGame {

	// atributos
	public int saudeAtual;
	public String nome;
	private String status;

	public PersonagemGame(int saudeAtual, String nome) {
		setSaudeAtual(saudeAtual);
		setNome(nome);
	}

	public int getSaudeAtual() {
		return saudeAtual;
	}

	public void setSaudeAtual(int saudeAtual) {
		this.saudeAtual = !(saudeAtual >= 0) ? 0 : saudeAtual;
		status = this.saudeAtual > 0 ? "vivo" : "morto";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome == null || nome == "" ? this.nome : nome;
	}

	public String getStatus() {
		return status;
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
