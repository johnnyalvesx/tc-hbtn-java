public class Tarefa {

    private String descricao;
    private boolean estahFeita;
    private int identificador;

    public Tarefa(String descricao, int indentificador) {
	this.descricao = descricao;
	this.identificador = indentificador;
    }

    public String getDescricao() {
	return descricao;
    }

    public boolean isEstahFeita() {
	return estahFeita;
    }
    
    public void setEstahFeita(boolean estahFeita) {
        this.estahFeita = estahFeita;
    }

    public int getIdentificador() {
	return identificador;
    }

    public String modificarDescricao(String descricao) {
	if (descricao == null || descricao.equals("")) {
	    throw new IllegalArgumentException("Descricao de tarefa invalida");
	}
	return descricao;

    }
}
