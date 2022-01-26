package numeros;

public class Numeros0a99 {

	public static void main(String[] args) {

		for (int contador = 0; contador < 100; contador++) {
			if (contador < 99) {
				System.out.print(contador + ", ");
			} else {
				System.out.print(contador +"\n");
			}
		}
	}
}
