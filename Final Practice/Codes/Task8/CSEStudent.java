public class CSEStudent extends Student{
  public String msg;
  public CSEStudent(){
    msg="I want to transfer to CSE ";
  }
  public String shout(){
    super.shout();
    return this.msg;
  }
}
class CSE111Student extends Student{
  public String msg;
  public CSE111Student(){
    msg="I love Java Programming ";
  }
  public String shout(){
    super.shout();
    return this.msg;
  }
}