import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		float taxa = 0.2456f;
		float valor = 7654.321f;
		System.out.printf("Valor: R$ %.2f\nTaxa: %.2f", valor, taxa);
		System.out.println("%");
	}
}
