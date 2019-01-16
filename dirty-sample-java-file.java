public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!");
  @akiko-pusu
akiko-pusu a day ago  • 
 Contributor
[PMD] System.out.println is used (link)

system.out.println を使わないでねと怒られていますが、これはコマンドラインツールとしての利用なので、ここは許容しましょう
5行目も同様。

 @etrapos	Reply…
     System.out.println(test("one"));
  }

  /* PMD test: UseEqualsToCompareStrings */
  public static boolean test(String s) {
    if (s == "one") return true;
    if ("two".equals(s)) return true;
    return false; }
}
