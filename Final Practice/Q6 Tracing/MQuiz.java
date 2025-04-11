public class MQuiz {
  public static int var = 6;
  protected int x, y = 2;
  public MQuiz(){
    x += var - y;
    var += 2;
  }
  public void metA(int x, int temp){
    y = temp;
    temp = this.y + x;
    this.x += ++x - temp;
    System.out.println(x + " " + y + " " + temp);
  }
}
class TQuiz extends MQuiz{
  public static int y = 2;
  public int var = 6, temp = 3;
  public TQuiz(){
    y += 2;
    var = super.x + y;
    x = (temp++) + var;
    metA(x, temp);
  }
  public void metB(int x, int y){
    this.y += y;
    x = this.x + x;
    metA(x, temp);
    var = TQuiz.y + MQuiz.var;
    System.out.println(this.x +" "+ this.y +" "+ this.var);
  }
}

