public class A {
  static int temp = 4;
  static int x = -10;
  int sum, y;
  public A() {
    y = temp - 2;
    sum = temp + 1;
    temp -= 2;
  }
  public void methodA(int m, int n) {
    y = y + m + (temp++);
    x = x + 1 + n;
    sum = sum + x + y;
    System.out.println(x + " " + y + " " + sum);
  }
}
class B extends A {
  static int x = 0;
  int sum = -6;
  public B() {
    sum = 0;
    y = temp + 3;
    super.sum = 3 + temp + 2;
    temp -= 2;
  }
  public B(B b) {
    sum = b.sum + super.sum;
    x = b.x + 1;
    b.methodB(2, 3);
  }
  public void methodB(int m, int n) {
    int y = 0;
    y = y + this.y;
    x = y + 2 + (++temp);
    methodA(x, y);
    sum = x + y + sum;
    System.out.println(x + " " + y + " " + sum);
  }
}
