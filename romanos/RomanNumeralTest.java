import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanNumeralTest
{
   @Test public void I() throws InvalidParameter
   {
      assertEquals("I", 1, RomanNumeral.convierte("I"));
   }

   @Test public void II() throws InvalidParameter
   {
      assertEquals("II", 2, RomanNumeral.convierte("II"));
   }

   @Test public void IV() throws InvalidParameter
   {
      assertEquals("IV", 4, RomanNumeral.convierte("IV"));
   }

   @Test public void IX() throws InvalidParameter
   {
      assertEquals("IX", 9, RomanNumeral.convierte("IX"));
   }

   @Test public void MMXIX() throws InvalidParameter
   {
      assertEquals("MMXIX", 2019, RomanNumeral.convierte("MMXIX"));
   }

   @Test public void MCMXCVII() throws InvalidParameter
   {
      assertEquals("MCMXCVII", 1997, RomanNumeral.convierte("MCMXCVII"));
   }

   @Test (expected = InvalidParameter.class)
   public void noRomano() throws InvalidParameter
   {
      RomanNumeral.convierte("F");
   }

   @Test (expected = InvalidParameter.class)
   public void restaNoValida() throws InvalidParameter
   {
      RomanNumeral.convierte("IC");
   }

   @Test (expected = InvalidParameter.class)
   public void restaNoValida2() throws InvalidParameter
   {
      RomanNumeral.convierte("VX");
   }
 }
