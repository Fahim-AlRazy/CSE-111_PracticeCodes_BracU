public class Bondhus extends SocialMedia{
  public int limit=5;
  public int count=0;
  public String[] messeges=new String[limit];
  public Bondhus(String name , String email ){
    super(name , email);
  }
  public void showSentbox(){
    System.out.println(super.userName+"'s Sentbox: ");
    if(count==0){
      System.out.println("No sent messages. ");
    }
    else{
      for(int i=0;i<count;i++){
        System.out.println(messeges[i]);
      }
    }
  }
  public void sendMessage(String mesg){
    if(count<limit){
      messeges[count]=mesg;
      count++;
    }
    else{
      System.out.println("Sentbox is full. ");
    }
  }
  public String toString(){
    return super.toString() + "\n Messeges Sent: "+ count;
  }
  
}