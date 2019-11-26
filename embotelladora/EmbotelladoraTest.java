import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class EmbotelladoraTest
{
	double delta = 1e-15;

	// d1

	@Test
	public void liquidoEmbotellado() throws InvalidParameter, NoSolution
	{
		assertEquals(0.0, Embotelladora.calculaBotellasPequenas(4, 5, 13), delta);
	}

	@Test
	public void liquidoSoloBotellasPequenas() throws InvalidParameter, NoSolution
	{
		assertEquals(1.0, Embotelladora.calculaBotellasPequenas(1, 0, 1), delta);
	}

	@Test
	public void liquidoSoloBotellasGrandes() throws InvalidParameter, NoSolution
	{
		assertEquals(0.0, Embotelladora.calculaBotellasPequenas(0, 2, 5), delta);
	}

	// d2

	@Test (expected = NoSolution.class)
	public void liquidoNoEmbotellado_5() throws InvalidParameter, NoSolution
	{
		Embotelladora.calculaBotellasPequenas(1, 0, 5);
	}

	@Test (expected = NoSolution.class)
	public void liquidoNoEmbotellado_10() throws InvalidParameter, NoSolution
	{
		Embotelladora.calculaBotellasPequenas(0, 1, 10);
	}

	// d3

	@Test (expected = InvalidParameter.class)
	public void botellasGrandesNegativo() throws InvalidParameter, NoSolution
	{
		Embotelladora.calculaBotellasPequenas(0, -1, 0);
	}

	@Test (expected = InvalidParameter.class)
	public void botellasPequenasNegativo() throws InvalidParameter, NoSolution
	{
		Embotelladora.calculaBotellasPequenas(-1, 0, 0);
	}

	@Test (expected = InvalidParameter.class)
	public void totalNegativo() throws InvalidParameter, NoSolution
	{
		Embotelladora.calculaBotellasPequenas(0, 0, -1);
	}
}
