import java.util.Calendar;
import java.text.*;

public class prueba{
	public static void main (String[] args) throws InvalidParameter, NoSolution
	{
		int numeroBotellasGrandes = (int) Math.ceil(5 / (double) 2);

		System.out.println(numeroBotellasGrandes);
		System.out.println(Embotelladora.calculaBotellasPequenas(0, 2, 5));
	}
}
