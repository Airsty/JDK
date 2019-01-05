package lang.charsequanceTest;

public class CharsequanceTest {
  public static char charAt(){
    StringBuffer str = new StringBuffer("abcd");
    char index = str.charAt(2);
    return index;
  }

  public static String subSequance(String str){
    String subStr = str.substring(0,3);
    return subStr;
  }

  public static String toString(String str){
    String subStr = str.toString();
    return subStr;
  }

  public static void main(String[] args) {
    System.out.println(toString("0123456"));
  }

}
