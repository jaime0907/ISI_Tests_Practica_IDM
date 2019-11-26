import java.util.Calendar;

public class DescuentoBlackFriday
{
	/**
	* This program returns price with its discount if it is BlackFriday (29th of November)
	* @param precioOriginal original price
	* @param porcentajeDescuento discount to aply
	* @throws InvalidParameter if precioOriginal or porcentajeDescuento are invalid
	*/

	public static double PrecioFinal(double precioOriginal, double porcentajeDescuento) throws InvalidParameter
	{
		if (Double.compare(precioOriginal, 0.0) < 0) throw new InvalidParameter("precioOriginal cannot be negative");
		if (Double.compare(porcentajeDescuento, 0.0) < 0) throw new InvalidParameter("porcentajeDescuento cannot be negative");
		if (Double.compare(porcentajeDescuento, 100.0) > 0) throw new InvalidParameter("porcentajeDescuento cannot exceed 100");

		Calendar today = Calendar.getInstance();

		if (today.get(Calendar.MONTH) == Calendar.NOVEMBER && today.get(Calendar.DAY_OF_MONTH) == 29)
		{
			return precioOriginal*(1.0 - porcentajeDescuento / 100);
		}

		return precioOriginal;
	}
}
