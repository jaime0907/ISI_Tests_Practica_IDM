import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class RomanNumeralTest
{
   @Test public void I() throws InvalidParameter //c1.b1
   {
      assertEquals("I", 1, RomanNumeral.convierte("I"));
   }

   @Test public void II() throws InvalidParameter //c1.b1
   {
      assertEquals("II", 2, RomanNumeral.convierte("II"));
   }

   @Test public void IV() throws InvalidParameter //c1.b1, c1.b2, c2.b1
   {
      assertEquals("IV", 4, RomanNumeral.convierte("IV"));
   }

   @Test public void IX() throws InvalidParameter //c1.b1, c1.b3, c2.b1
   {
      assertEquals("IX", 9, RomanNumeral.convierte("IX"));
   }

   @Test public void MMXIX() throws InvalidParameter //c1.b1, c1.b3, c1.b7, c2.b1
   {
      assertEquals("MMXIX", 2019, RomanNumeral.convierte("MMXIX"));
   }

   @Test public void MCMXCVII() throws InvalidParameter //casi todos los bloques de c1, c2.b1
   {
      assertEquals("MCMXCVII", 1997, RomanNumeral.convierte("MCMXCVII"));
   }

   @Test (expected = InvalidParameter.class)
   public void noRomano() throws InvalidParameter //c1.b8
   {
      RomanNumeral.convierte("F");
   }

   @Test (expected = InvalidParameter.class)
   public void restaNoValida() throws InvalidParameter //c2.b2
   {
      RomanNumeral.convierte("IC");
   }

   @Test (expected = InvalidParameter.class)
   public void restaNoValida2() throws InvalidParameter //c2.b3
   {
      RomanNumeral.convierte("VX");
   }
 }
