public class NikeBD{
  public static int branch=0;
  public static int jordan=0;
  public static int cortez=0;
  public static int kobe=0;
  public static int sold=0;
  public String name;
  public int sell;
  public int jor;
  public int cort;
  public int kob;
  public NikeBD(String name){
    this.name=name;
    branch++;
  }
  public static void status(){
    System.out.println("Nike Bangladesh Status: \nBranches Opened: "+branch+"\nCurrently Stocked: Air Jordan: "+jordan+", Cortez: "+cortez+",Zoom Kobe: "+kobe+"\nSold: "+sold);
  }
  public void details(){
    System.out.println("Nike "+name+" Outlet: \n Products Currently Stocked: Air Jordan: "+jor+", Cortez: "+cort+",Zoom Kobe: "+kob+"\nSold: "+sell);
  }
  public void restockProducts(String name,int qnt){
    if(name.equals("Air Jordan")){
      jor+=qnt;
      jordan+=qnt;
    }
    else if(name.equals("Cortez")){
      cortez+=qnt;
      cort+=qnt;
    }
    else if(name.equals("Zoom Kobe")){
      kobe+=qnt;
      kob+=qnt;
    }
  }
  public void restockProducts(String []nam,int []qt){
    for(int i=0;i<nam.length;i++){
      this.restockProducts(nam[i] , qt[i]);
    }
  }
  public void productSold(String name,int qty){
    if(name.equals("Air Jordan")){
      jor-=qty;
      jordan-=qty;
      sold+=qty;
      sell+=qty;
    }
    else if(name.equals("Cortez")){
      cortez-=qty;
      cort-=qty;
      sold+=qty;
      sell+=qty;
    }
    else if(name.equals("Zoom Kobe")){
      kobe-=qty;
      kob-=qty;
      sold+=qty;
      sell+=qty;
    }
  }
  public void productSold(String n1,int q1 , String n2 , int q2){
    this.productSold(n1,q1);
    this.productSold(n2,q2);
  }
}