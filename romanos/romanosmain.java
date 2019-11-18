public class romanosmain{
  public static void main (String[] args) throws InvalidParameter
  {
    char c = 'a';
    String s = "II";
    for(int i = 0; i < s.length(); i++){
      c = (s.charAt(i));
      System.out.println("|" + c + "|");
    }
    int num = RomanNumeral.convierte("II");
    System.out.println("*" + num + "*");
  }
}
