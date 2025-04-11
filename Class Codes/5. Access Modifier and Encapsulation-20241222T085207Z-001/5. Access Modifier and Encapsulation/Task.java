public class Task {
  public int x;
  public int y;
  public Task() {
    x = this.x + 5;
  }
  public Task(int x) {
    this();
    this.x = x + 10;
  }
  public void met(Task[] t) {
    int x = t[0].met(t[1]) + t[1].x++;
    int y = ++x + t[1].met(t[0]);
    System.out.println(x + " " + y);
  }
  public int met(Task t) {
    int x = (int) (t.x % 2 - y + 2);
    t.y = x + this.y;
    System.out.println(x + " " + t.y);
    return x;
  }
}