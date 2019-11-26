import java.util.Calendar;
import java.text.*;

public class prueba{
	public static void main (String[] args)
	{
		Calendar today = Calendar.getInstance();
		System.out.println(today.getTime());

		if (today.get(Calendar.MONTH) == Calendar.NOVEMBER && today.get(Calendar.DAY_OF_MONTH) == 29)
		{
			System.out.println("Sus muertos");
		}
	}
}
