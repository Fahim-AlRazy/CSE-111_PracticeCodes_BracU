public class TracingExample {
  public static double counter = 3.0;
  public static int a, b;
  public TracingExample(int a, int b) {
    this.a = a;
    b = (a + b) % 2;
    counter++;
  }
  public void methodA(int value) {
    this.a += value;
    int z = (a + b) % 3;
    System.out.println(this.a + " " + z + counter);
    if (a >= 15) {
      this.methodB(this);
      System.out.println(z + counter + " " + this.a);
    }
  }
  public static void methodA(double value) {
    a += value;
    int z = (a + b) % 3;
    System.out.println(a + " " + 1 + z + counter);
    a += 2;
  }
  public static void methodB(TracingExample obj) {
    double temp = (counter * 2) + 2;
    obj.a += temp;
    System.out.println(obj.a + " " + temp);
  }
}
