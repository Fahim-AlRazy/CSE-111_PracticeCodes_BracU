public class tracing1 {
  public static void main(String[] args) {
    Test m = new Test();
    m.n = m.m = 5;
    Test n = new Test();
    n.m = m.metA(2);
    n.n = n.metA(4);
    System.out.println(m.n+m.m+" "+n.m+" "+n.n);
  }
}
