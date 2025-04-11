public class Tester {
  public static void main(String[] args) {
    Task t1 = new Task();
    Task t2 = new Task(2);
    Task[] ta = {t1, t2};
    t1.met(ta);
  }
}