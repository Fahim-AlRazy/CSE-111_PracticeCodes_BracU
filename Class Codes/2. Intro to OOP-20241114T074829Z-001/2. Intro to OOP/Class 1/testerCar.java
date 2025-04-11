class testerCar{
  public static void main(String [] args){
    // String st = " AKJbkja";
    // String s2 = new String();
    // int [] arr = {1,2,3,4};
    // System.out.println(arr);
    // System.out.println(arr.length);
    //className var = new className();
    Car c1 = new Car(); //Object create
    // System.out.println(c1);
    System.out.println(c1.model);
    System.out.println(c1.color);
    System.out.println(c1.year);
    c1.model = "Premio";
    c1.color = "White";
    c1.year = 2010;
    System.out.println(c1.model);
    System.out.println(c1.color);
    System.out.println(c1.year);
    Car c2 = new Car();
    System.out.println("c2 details: ");
    System.out.println(c2.model);
    System.out.println(c2.color);
    System.out.println(c2.year);
    c2.model = "Tesla Y";
    c2.color = "Black";
    c2.year = 2023;
    System.out.println(c2.model);
    System.out.println(c2.color);
    System.out.println(c2.year);
    c1.year = 2015;
    System.out.println(c1.year);
  }
}