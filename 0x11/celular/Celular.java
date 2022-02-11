package celular;

import java.util.ArrayList;
import java.util.List;

public class Celular {

    private List<Contato> contatos = new ArrayList<>();

    public void adicionarContato(Contato contato) {
	if (buscarContato(contato.getNome()) == null) {
	    contatos.add(contato);
	} else {
	    throw new IllegalArgumentException(
		    "Nao foi possivel adicionar contato. Contato jah existente com esse nome");
	}

    }

    public void removerContato(Contato contatoParaRemover) {
	Contato contato = buscarContato(contatoParaRemover.getNome());
	if (contato != null) {
	    contatos.remove(contato);
	} else {
	    throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
	}

    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
	Contato contato = buscarContato(contatoAntigo.getNome());
	if (contato == null) {
	    throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
	} else if (contatoAntigo.getNome() != novoContato.getNome() && buscarContato(novoContato.getNome()) != null) {
	    throw new IllegalArgumentException(
		    "Nao foi possivel modificar contato. Contato jah existente com esse nome");
	}

	Integer posicaoContato = buscarPosicaoContato(contato);
	contatos.set(posicaoContato, novoContato);
    }

    public void listarContatos() {
	for (Contato contato : contatos) {
	    System.out.println(contato.getNome() + " -> " + contato.getNumero() + " (" + contato.getTipo() + ")");
	}
    }

    private Contato buscarContato(String nomeContato) {
	for (Contato contato : contatos) {
	    if (contato.getNome().equals(nomeContato)) {
		return contato;
	    }
	}
	return null;
    }

    public int buscarPosicaoContato(Contato contato) {
	return contatos.indexOf(contato);
    }
}
