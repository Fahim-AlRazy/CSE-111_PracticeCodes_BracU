public class stringTask3{
  public static boolean emailChecker(String x){
    boolean flag=true;
    int count_at=0;
    for(int i=0;i<x.length();i++){  //@ counter
      if((x.charAt(i))=='@'){
        count_at++;
      }
    }
    int n=x.indexOf('@');
    if(count_at==0 || count_at>1 ){
      flag=false;
    }
    else{
      if(x.charAt(n-1)>='a' && x.charAt(n-1)<='z' && x.charAt(n+1)>='a' && x.charAt(n+1)<='z'){
        int count_dot=0;
        int m=0;
        for(int i=n;i<x.length();i++){
          if((x.charAt(i))=='.'){
            count_dot++;
            m=x.indexOf('.');
          }
        }
        if(count_dot==0 || count_dot>1){
          flag=false;
        }
        else{
          if(x.charAt(m+1)>='a' && x.charAt(m+1)<='z'){
            flag=true;
          }
          else{
            flag=false;
          }
        }
      }
      else{
        flag=false;
      }
    }
    return flag;
  }
  public static void main(String[] args){
    String[] email_list = {"abc@gmail.com", "!@cv.bd", "123cse@bracu.ac.bd"};
    int count=0;
    for(int i=0;i<email_list.length;i++){
      boolean test=emailChecker(email_list[i]);
      if(test){
        count++;
      }
    }
    System.out.println("Valid email addresses count = "+count);
  }
}