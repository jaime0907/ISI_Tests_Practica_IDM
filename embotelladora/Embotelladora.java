import java.lang.Math;

public class Embotelladora
{
	/**
	* This program returns price with its discount if its Black
	* Friday (29th of November)
	* @param pequenas small bottles to bottle up
	* @param grandes large bottles to bottle up
	* @param total number of liters/litres of liquid to bottle up
	* @throws InvalidParameter if pequenas, grandes or total are invalid
	* @throws NoSolution if there is not enough bottles to bottle up all the total liters/litres
	*/

	public static double calculaBotellasPequenas(int pequenas, int grandes, int total) throws InvalidParameter, NoSolution
	{
		if(pequenas < 0) throw new InvalidParameter("pequenas cannot be negative");
		if(grandes < 0) throw new InvalidParameter("grandes cannot be negative");
		if(total < 0) throw new InvalidParameter("total cannot be negative");
		if(pequenas + grandes*5 < total) throw new NoSolution("there is not enough bottles to bottle up all the liquid");

		int numeroBotellasGrandes = (int) Math.ceil(total / (double) (grandes*5));

		if(numeroBotellasGrandes <= grandes)
		{
			return 0.0;
		} else {
			return (double) (total - grandes*5);
		}
	}
}
