import java.util.List;

public class ManipularArrayNumeros {

    static public int buscarPosicaoNumero(List<Integer> list, int num) {
	return list.indexOf(num);
    }

    public static void adicionarNumero(List<Integer> list, int num) {
	int resultado = buscarPosicaoNumero(list, num);
	if (resultado > 0) {
	    throw new IllegalArgumentException("Numero jah contido na lista");
	}
	list.add(num);
    }

    public static void removerNumero(List<Integer> list, int num) {
	int resultado = buscarPosicaoNumero(list, num);
	if (resultado < 0) {
	    throw new IllegalArgumentException("Numero nao encontrado na lista");
	}
	list.remove(resultado);
    }

    public static void substituirNumero(List<Integer> list, int numeroSubstituir, int numeroSubstituto) {
	int resultado = buscarPosicaoNumero(list, numeroSubstituir);
	if (resultado < 0) {
	    list.add(numeroSubstituto);
	} else {
	    list.set(resultado, numeroSubstituto);
	}
    }
}
