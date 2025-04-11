public class TraceA {
  public int x = 0, y = 8, sum = 0;
  public void methodA(int y, int z) {
    this.x += ++x;
    sum = x + methodB(this.x, y+2, z) + this.x;
    System.out.println(x +" "+ y +" "+ sum);
  }
  public int methodB(int a, int b, int x) {
    if (a % b == x) {
      return this.y--;
    }
    this.x = x++ + this.x;
    y += this.x;
    System.out.println(a +" "+ this.x +" "+ y);
    return y++;
  }
}



