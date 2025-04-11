public class Reader{
  public String name;
  public int capacity=0;
  public int count=0;
  public String[] arr;
  
  
  public void createReader(String nam,int cap){
    this.name=nam;
    this.capacity=cap;
    this.arr=new String[5];
  }
  
  
  public void readerInfo(){
    System.out.println("Name: "+this.name+"\nCapacity: "+this.capacity+"\nBooks: ");
    if(count==0){
      System.out.println("No books added yet");
    }
    else{
      for(int i=0;i<this.count;i++){
        System.out.println("Book "+(i+1)+": "+arr[i]);
      }
    }
  }
  
  public void addBook(String book){
    if((capacity-count)==0){
      System.out.println("No more space for new book");
    }
    else{
      arr[count]=book;
      count++;
    }
  }
  public void increaseCapacity(int cpcty){
    this.capacity=cpcty;
  //  this.arr = new String[cpcty];
    System.out.println(this.name+"'s capacity increased to "+cpcty);
  }
  
}