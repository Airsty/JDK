package lang.comparable;

/**
 * 此接口强行对实现它的每个类的对象进行整体排序。这种排序被称为类的自然排序，类的 compareTo 方法被称为它的自然比较方法。
 *
 * 实现此接口的对象列表（和数组）可以通过 Collections.sort（和 Arrays.sort）进行自动排序。实现此接口的对象可以用作有序映射中的键或有序集合中的元素，无需指定比较器。
 */
public class ComparableTest{

  /**
   * 比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数。
   *
   * 参数必须为对象
   * @return
   */
  public static int compareToTest(Integer big,Integer small){
    ComparableTest comparableTest = new ComparableTest();
    int result = big.compareTo(small);
    return result;
  }

  public static void main(String[] args) {
    System.out.println(compareToTest(1,2));
  }
}
