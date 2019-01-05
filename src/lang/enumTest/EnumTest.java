package lang.enumTest;

public enum  EnumTest {
  NEW(1,"新建"),

  FINISH(2,"完成"),
  ;

  Integer code;
  String message;

  EnumTest(Integer code, String message) {
    this.code = code;
    this.message = message;
  }
}
