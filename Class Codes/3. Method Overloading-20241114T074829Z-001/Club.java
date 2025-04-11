public class Club{
  public String name;
  public double budget;
  public int members;
  public String [] events;
  public int [] ev_mem;
  public int count;
  public String approveClub(String name, int mem, int bud, int cap){
    if (mem >= 5){
      this.name = name;
      budget = bud;
      members = mem;
      events = new String[cap];
      ev_mem = new int[cap];
      return "New club, "+name+", created with "+mem+" members.";
    }
    else{
      return "A club must have at least 5 members.";
    }
  }
  public void info(){
    
    if(count == 0){
      System.out.println("No events yet.");
    }
    else{
      System.out.println("Events:");
      for( int i = 0; i <events.length; i++){
        if(events[i] != null){
          System.out.println(events[i]);
        }
      }
    }                      
  }
  public void createEvent(String ename, int cost, int emem){
    if(emem > members){
      System.out.println("Need " +(emem-members)+ "more member(s)");
    }
    else if (cost > budget){
      System.out.println("Not enought budget");
    }
    else{
//      events[count] = ename;
//      count++;
      boolean flag = false;
      for(int i = 0; i<events.length; i++){
        if(events[i] == null){
          events[i] = ename;
          ev_mem[i] = emem;
          members -= emem;
          budget -= cost;
          count++;
          flag = true;
          System.out.println("   ")
          break;
        }
      }
      if(!flag){
        System.out.prinntln("Event cannot take place");
      }
    }
  }
  
  
    
//  addContent(String s1){
//    cond
//      printing
//  }
//  
//  addContent(String s1, String s2){
//    
//    addContent(s1);
//    addContent(s2);
//    
//  }
    
    
    
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  