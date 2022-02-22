import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase) {
	TreeMap<String, Integer> map = new TreeMap<>();

	// tratamentos
	frase = frase.replace("?", "");
	frase = frase.replace("!", "");
	frase = frase.replace(".", "");

	// separar
	String[] array = frase.split(" ");

	// contadores
	int total = 0;

	for (int contUm = 0; contUm < array.length; contUm++) {
	    for (int contDois = 0; contDois < array.length; contDois++) {
		if (array[contUm].equalsIgnoreCase(array[contDois])) {
		    total++;
		}
	    }
	    map.put(array[contUm].toLowerCase(), total);
	}
	return map;
    }
}
