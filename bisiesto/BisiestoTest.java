import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class BisiestoTest
{
   @Test public void notBisiesto() throws InvalidParameter //b1
   {
      assertEquals("No bisiesto", false, Bisiesto.esBisiesto(2019));
   }

   @Test public void esBisiestoNormal() throws InvalidParameter //b2
   {
      assertEquals("Es bisiesto 2020", true, Bisiesto.esBisiesto(2020));
   }

   @Test public void noEsBisiesto100() throws InvalidParameter //b3
   {
      assertEquals("No bisiesto 2100", false, Bisiesto.esBisiesto(2100));
   }

   @Test public void esBisiesto400() throws InvalidParameter //b4
   {
      assertEquals("Es bisiesto 2000", true, Bisiesto.esBisiesto(2000));
   }

   @Test (expected = InvalidParameter.class)
   public void zeroYear() throws InvalidParameter //b5
   {
      Bisiesto.esBisiesto(0);
   }

   @Test (expected = InvalidParameter.class)
   public void negativeYear() throws InvalidParameter //b5
   {
      Bisiesto.esBisiesto(-3);
   }
 }
