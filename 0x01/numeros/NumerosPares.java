package numeros;

public class NumerosPares {

	public static void main(String[] args) {

		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0) {
				if (i < 100) {
					System.out.print(i + ", ");
				} else if (i == 100) {
					System.out.print(i + "\n");
				}
			}
		}
	}
}
