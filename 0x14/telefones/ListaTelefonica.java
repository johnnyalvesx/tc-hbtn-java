import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> listaTelefones;

    public ListaTelefonica() {
	listaTelefones = new HashMap<>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {
	ArrayList<Telefone> telefoneTemp = new ArrayList<Telefone>();

	if (!listaTelefones.containsKey(nome)) {
	    telefoneTemp.add(telefone);
	    listaTelefones.put(nome, telefoneTemp);
	} else {
	    telefoneTemp = listaTelefones.get(nome);
	    telefoneTemp.add(telefone);
	    listaTelefones.put(nome, telefoneTemp);
	}
    }

    public ArrayList<Telefone> buscar(String nome) {

	ArrayList<Telefone> telTemp = new ArrayList<Telefone>();

	if (!listaTelefones.containsKey(nome)) {
	    return null;
	} else {
	    telTemp = listaTelefones.get(nome);
	    return telTemp;
	}
    }
}
