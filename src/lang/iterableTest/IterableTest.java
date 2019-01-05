package lang.iterableTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableTest {

  public static Iterator<Integer> iterableTest(List<Integer> list){
    Iterator<Integer> newList = list.iterator();
    return newList;
  }

  public static void main(String[] args) {
//    List<String> list = new ArrayList<>();
//    list.add("1");
//    list.add("3");
//    list.add("2");
//    for (Iterator iter = list.iterator();iter.hasNext();){
//      String str = (String)iter.next();
//      System.out.println(str);
//    }
    test();
  }

  public static void test(){
    String str = "true";
    Boolean aaa = Boolean.valueOf(str);
    System.out.println(aaa);
  }


}
