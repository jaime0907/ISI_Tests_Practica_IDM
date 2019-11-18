public class bisiesto
{
  /**
  * Check if year is bisiesto
  *
  * @param year year to check
  * @return true if bisiesto, false if not
  * @throws NullPointerException if year is null
  */
  public static boolean esBisiesto(int year){
    //if(year == null) throw new InvalidParameter("Year no puede ser null");
    if(year % 400 == 0) return true;
    if(year % 100 == 0) return false;
    return (year % 4 == 0);
  }
}
