import java.util.ArrayList;

import atividades.Atividade;

public class Workflow {
    private ArrayList<Atividade> atividades = new ArrayList<>();

    public ArrayList<Atividade> getAtividades() {
	return atividades;
    }

    public void registrarAtividade(Atividade atividade) {
	atividades.add(atividade);
    }
}
