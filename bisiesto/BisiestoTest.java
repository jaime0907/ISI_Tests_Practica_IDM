import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestoTest
{
   @Test public void notBisiesto() throws InvalidParameter
   {
      assertEquals("No bisiesto", false, Bisiesto.esBisiesto(2019));
   }

   @Test public void esBisiestoNormal() throws InvalidParameter
   {
      assertEquals("Es bisiesto 2020", true, Bisiesto.esBisiesto(2020));
   }

   @Test public void noEsBisiesto100() throws InvalidParameter
   {
      assertEquals("No bisiesto 2100", false, Bisiesto.esBisiesto(2100));
   }

   @Test public void esBisiesto400() throws InvalidParameter
   {
      assertEquals("Es bisiesto 2000", true, Bisiesto.esBisiesto(2000));
   }

   @Test (expected = InvalidParameter.class)
   public void zeroYear() throws InvalidParameter
   {
      Bisiesto.esBisiesto(0);
   }

   @Test (expected = InvalidParameter.class)
   public void negativeYear() throws InvalidParameter
   {
      Bisiesto.esBisiesto(-3);
   }
 }
