package lang.integerTest;

public class IntegerTest {

  public static void main(String[] args) {
    Integer.bitCount(1);
    Integer.decode("123");
    Integer count = 10;
    count.doubleValue();
    String str = Integer.toString(123);
    System.out.println(Integer.parseInt(str));
    System.out.println(Integer.valueOf(str));

  }

}
