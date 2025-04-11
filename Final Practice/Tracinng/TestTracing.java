public class TestTracing {
  public static void main(String[ ] args) {
    TracingExample t1 = new TracingExample(2, 3);
    TracingExample t2 = new TracingExample(5, 7);
    t1.methodA(TracingExample.counter);
    t1.methodA(7);
    TracingExample.methodA(3.0);
  }
}
