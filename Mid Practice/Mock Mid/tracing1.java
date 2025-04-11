public class tracing1 { 
  public static void main(String[] args) { 
    MidTest p = new MidTest(); 
    int[] r = {3, 0, 7}; 
    p.method(5,1);
    p.r = r;
    r[0] = p.method(p.a+p.b);
  }
}
