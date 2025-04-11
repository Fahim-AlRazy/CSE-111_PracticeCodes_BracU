public class Test {
  public static int a=3;
  public int b=7, c;
  public Test(){
    methodA(a+4);
  }
  public void methodA(int a){
    Tracing t = new Tracing(2,7);
    a = Tracing.a+ Test.a;
    c = b + a + t.methodB();
    System.out.println(this.a+" "+this.b+" "+c);
  }
}
class Tracing {
  public static int a = 9, y = 5;
  public int x, b;
  public Tracing(int a, int b){
    x += a;
    y += b;
    this.a = this.x;
    this.b = this.y;
  }
  public int methodB(){
    System.out.println(this.a+" "+this.b+" "+x);
    b = y - this.b + Test.a;
    x += this.b;
    return this.b;
  }
}

