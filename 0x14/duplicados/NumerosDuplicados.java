import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {

	List<Integer> numDuplicados = new ArrayList<>();
	for (int cont = 0; cont < numeros.length; cont++) {
	    numDuplicados.add(numeros[cont]);
	}

	Set<Integer> numDuplicadosRemovidosSet = new HashSet<>();
	Set<Integer> numDuplicadosSet = numDuplicados.stream().filter(n -> !numDuplicadosRemovidosSet.add(n))
		.collect(Collectors.toSet());

	TreeSet<Integer> setNumDuplicados = new TreeSet<Integer>();

	for (Integer numeroLista : numDuplicadosSet) {
	    setNumDuplicados.add(numeroLista);
	}
	return setNumDuplicados;
    }
}
