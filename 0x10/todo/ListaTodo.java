import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas = new ArrayList<>();

    public ListaTodo() {
    }

    public void adicionarTarefa(Tarefa t) {
	for (Tarefa tarefa : tarefas) {
	    if (tarefa.getIdentificador() == t.getIdentificador()) {
		throw new IllegalArgumentException(
			"Tarefa com identificador " + t.getIdentificador() + " ja existente na lista");
	    }
	    if (t.getDescricao().isEmpty() || t.getDescricao().equals("")) {
		throw new IllegalArgumentException("Descricao de tarefa invalida");
	    }

	}
	tarefas.add(t);
    }

    public boolean marcarTarefaFeita(int idTarefa) {
	boolean feita = false;
	for (Tarefa tarefa : tarefas) {
	    if (tarefa.getIdentificador() == idTarefa) {
		feita = true;
		tarefa.setEstahFeita(true);
	    }
	}
	return feita;
    }

    public boolean desfazerTarefa(int idTarefa) {
	boolean desfeita = false;
	for (Tarefa tarefa : tarefas) {
	    if (tarefa.getIdentificador() == idTarefa) {
		desfeita = true;
		tarefa.setEstahFeita(false);
	    }
	}
	return desfeita;
    }

    public void fazerTodas() {
	for (Tarefa tarefa : tarefas) {
	    tarefa.setEstahFeita(true);
	}
    }

    public void desfazerTodas() {
	for (Tarefa tarefa : tarefas) {
	    tarefa.setEstahFeita(false);
	}
    }

    public void listarTarefas() {
	for (Tarefa tarefa : tarefas) {
	    if (tarefa.isEstahFeita()) {
		System.out.println("[X]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
	    } else {
		System.out.println("[ ]  Id: " + tarefa.getIdentificador() + " - Descricao: " + tarefa.getDescricao());
	    }
	}

    }

}
