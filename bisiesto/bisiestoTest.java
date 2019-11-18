import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class bisiestoTest
{
   @Test public void notBisiesto()
   {
      assertEquals("No bisiesto", false, bisiesto.esBisiesto(2019));
   }

   @Test public void esBisiestoNormal()
   {
      assertEquals("Es bisiesto 2020", true, bisiesto.esBisiesto(2020));
   }

   @Test public void noEsBisiesto100()
   {
      assertEquals("No bisiesto 2100", false, bisiesto.esBisiesto(2100));
   }

   @Test public void esBisiesto400()
   {
      assertEquals("Es bisiesto 2000", true, bisiesto.esBisiesto(2000));
   }

   @Test (expected = NullPointerException.class)
   public void nullYear()
   {
      int year = null;
      bisiesto.esBisiesto(year);
   }
 }
