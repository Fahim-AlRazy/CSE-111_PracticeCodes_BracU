public class Nokia extends Mobile{
  public double balance=0.0;
  public Nokia(String name ,boolean status ,String imi , int bal){
    super(name, imi , status);
    balance=bal;
  }
  public String toString(){
    return super.toString() +"\nBalance: "+balance+" TK";
  }
  public void activateSimCard(){
    simCardStatus=true;
    System.out.println("SIM card is activated successfully. ");
  }
  public void rechargeSIMCard(int amount){
    balance+=amount;
    System.out.println("Recharge successful! Current balance "+balance+" TK. ");
  }
  public String dialCall(String number){
    String print;
    if(simCardStatus){
      if(balance!=0){
        if('8'==number.charAt(0)){
          print="Dialing the number"+number+" to Bangladesh region";
        }
        else if('4'==number.charAt(0)){
          print="Dialing the number"+number+" to USA region";
        }
        else{
          print="Dialing is not allowed in this region.";
        }
      }
      else{
        print="Insufficient balance! Please recharge.";
      }
    }
    else{
      print="No Sim card available! Please check the Sim card connectivity";
    }
    return print;
  }
  
}
