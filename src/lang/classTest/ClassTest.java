package lang.classTest;

public class ClassTest {

  public static void main(String[] args) {
    Double dou = 2.333;
    double ddd = dou.doubleValue();
    long lon = Double.doubleToLongBits(ddd);
    short sss = dou.shortValue();
  }

}
