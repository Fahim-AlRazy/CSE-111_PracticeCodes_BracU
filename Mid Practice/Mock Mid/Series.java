public class Series{
  public String title="[BLANK]";
  public String[] genre=new String[2];
  public int total_episodes=0;
  public int watched=0;
  public boolean watch=true;
  
  public String showDetails(){
    String print="";
    System.out.println("Show name: "+this.title);
    if(title.equals("[BLANK]")){
      System.out.println("Total Episodes: -1 \nGenre: NONE");
    }
    else{
      System.out.println("Total Episodes: "+this.total_episodes);
      System.out.print("Genre : ");
      for(int i=0;i<2;i++){
        if(i==0){
          System.out.print(genre[i]);
        }
        else{
          if(genre[i]!=null){
            System.out.print(" , "+genre[i]);
          }
        }
      }
      System.out.println();
    }
    if(total_episodes-watched==0){
      print="Show is watched";
    }
    else{
      print="Show is not watched";
    }
    return print;
  }
  
  public void watchEpisodes(int ep){
    watched+=ep;
    if(total_episodes-watched ==0){
      System.out.println("Finished show after watching "+ep+" episodes of "+title);
    }
    else{
      System.out.println("Watching "+ep+" episodes of "+this.title);
    }
    if(total_episodes-watched==0){
      watch=true;
    }
    else{
      watch=false;
    }
  }
  
  public void updateInfo(String name,String genre1,String genre2,int ep){
    for(int i=0;i<2;i++){
      if(i==0){
        genre[i]=genre1;
      }
      else{
        genre[i]=genre2;
      }
    }
    this.title=name;
    total_episodes=ep;
    System.out.println("Updated information for "+this.title);
  }
  public void updateInfo(String name,String genre1,int ep){
    this.title=name;
    genre[0]=genre1;
    total_episodes=ep;
    System.out.println("Updated information for "+this.title);
  }
}