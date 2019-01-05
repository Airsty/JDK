package lang.appendableTest;

public class AppendableTest {

  public static void append(){
    StringBuffer str = new StringBuffer("abc");
    str.append('d');
    System.out.println(str);
  }

  public static void appendSequence(){
    StringBuffer str = new StringBuffer("abc");
    str.append("abc");
    System.out.println(str);
  }

  /**
   * start是子序列的第一个字符的索引
   * end是子序列紧随最后一个字符的索引
   * @param subStr
   * @param start
   * @param end
   */
  public static void appendStartToEnd(String subStr,int start,int end){
    StringBuffer str = new StringBuffer("abc");
    str.append(subStr,start,end);
    System.out.println(str);
  }

  public static void main(String[] args) {
    appendStartToEnd("12345",1,3);
  }

}
