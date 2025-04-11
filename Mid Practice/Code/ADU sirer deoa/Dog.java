public class Dog{
  public String name="A dog";
  public String color="";
  public String bark="";
  public boolean ghew_name=false;
  public boolean ghew_color=false;
  public void changeName(String name){
    this.name=name;
    ghew_name=true;
  }
  public void changeColor(String color){
    this.color=color;
    ghew_color=true;
    if(ghew_name){
      System.out.println(this.name+" is "+this.color);
    }
    else{
      System.out.println("This dog is "+this.color);
    }
  }
  public String bark(){
    String print="";
    if(ghew_name && ghew_color){
      print=this.name+" the "+this.color+" dog is barking";
    }
    else if(ghew_name){
      print=this.name+" is barking";
    }
    else if(ghew_color){
      print=this.color+" dog is barking";
    }
    else{
      print=this.name+" is barking";
    }
    return print;
  }
}