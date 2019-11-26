import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class DescuentoBlackFridayTest
{
	double delta = 1e-15;
	Calendar c1 = Calendar.getInstance();

	@Before
	public void establecerTiempoPrueba()
	{
		c1.set(Calendar.MONTH, Calendar.NOVEMBER);
		c1.set(Calendar.DAY_OF_MONTH, 29);
	}

	// f1

	@Test
	public void diaNormal() throws InvalidParameter
	{
		assertEquals(1.00, DescuentoBlackFriday.PrecioFinal(1.00, 10.00), delta);
	}

	// f2

	@Test
	public void descuentoUno() throws InvalidParameter
	{
		assertEquals(0.99, DescuentoBlackFriday.PrecioFinal(1.00, 1.00), delta);
	}

	@Test
	public void descuentoCien() throws InvalidParameter
	{
		assertEquals(0.00, DescuentoBlackFriday.PrecioFinal(1.00, 100.00), delta);
	}

	// f3

	@Test
	public void descuentoCero() throws InvalidParameter
	{
		assertEquals(1.00, DescuentoBlackFriday.PrecioFinal(1.00, 0.00), delta);
	}

	// f4

	@Test (expected = InvalidParameter.class)
	public void descuentoImposible() throws InvalidParameter
	{
		DescuentoBlackFriday.PrecioFinal(1.00, 101.00);
	}

	@Test (expected = InvalidParameter.class)
	public void descuentoNegativo() throws InvalidParameter
	{
		DescuentoBlackFriday.PrecioFinal(1.00, -1.00);
	}

	// f5

	@Test
	public void precioCero() throws InvalidParameter
	{
		assertEquals(0.0, DescuentoBlackFriday.PrecioFinal(0.00, 1.00), delta);
	}

	// f6

	@Test (expected = InvalidParameter.class)
	public void precioNegativo() throws InvalidParameter
	{
		DescuentoBlackFriday.PrecioFinal(-1.00, 0.00);
	}
}
