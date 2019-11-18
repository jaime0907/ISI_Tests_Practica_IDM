public class RomanNumeral {
  // Parametro: s es un numero romano
  // Devuelve : el numero s en base 10
  // Eleva la excepcion InvalidParameter si s no es un numero romano
  public static int convierte(String s) throws InvalidParameter {
    int num = 0;
    int prevnum = 2000;
    int total = 0;
    for(int i = 0; i < s.length(); i++){
      num = letraADec(s.charAt(i));
      if(num > prevnum){
        if(checkRestaValida(prevnum, num)){
          total = total + num - 2*prevnum;
        }else{
          throw new InvalidParameter("Numero no romano");
        }
      }else{
        total = total + num;
      }
      prevnum = num;
    }
    return total;
  }

  private static int letraADec(char c) throws InvalidParameter {
    if(c == 'I') return 1;
    if(c == 'V') return 5;
    if(c == 'X') return 10;
    if(c == 'L') return 50;
    if(c == 'C') return 100;
    if(c == 'D') return 500;
    if(c == 'M') return 1000;
    throw new InvalidParameter("Numero no romano");
  }

  private static boolean checkRestaValida(int a, int b){
    if(a == 1){
      return (b == 5 || b == 10);
    }else if(a == 10){
      return (b == 50 || b == 100);
    }else if(a == 100){
      return (b == 500 || b == 1000);
    }else{
      return false;
    }
  }
}
