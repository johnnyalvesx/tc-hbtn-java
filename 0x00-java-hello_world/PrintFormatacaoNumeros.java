package java_study;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
	public static void main(String[] args) {
		float taxa = 0.2456f;
		float valor = 7654.321f;
		DecimalFormat df = new DecimalFormat("0,000.00");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		NumberFormat nf = NumberFormat.getInstance(new Locale("en", "US"));
		String val = nf.format(valor);
		System.out.printf("Valor: R$ ");
		System.out.println(df.format(valor));
		System.out.printf("Taxa: %.2f%%\n", taxa);
	}
}
