public class Tester2 {
  public static void main(String[] args) {
    Series s1 = new Series();
    System.out.println("========1========");
    System.out.println(s1.showDetails());
    s1.updateInfo("Wednesday", "Mystery,Supernatural", 15);
    System.out.println(s1.showDetails());
    System.out.println("========2========");
    Series s2 = new Series();
    s2.updateInfo("Dark","Sci-fi", 10);
    System.out.println(s2.showDetails());
    System.out.println("========3========");
    s1.watchEpisodes(10);
    s2.watchEpisodes(10);
    Series s3 = new Series();
    s3.updateInfo("Suits","Comedy,Courtroom", 20);
    System.out.println("========4========");
    System.out.println(s3.showDetails());
    s1.watchEpisodes(2);
    System.out.println("You have watched"+s1.watched+" episodes of "+s1.title);
    s3.watchEpisodes(15);
    s1.watchEpisodes(6);
    System.out.println("========5========");
    System.out.println(s1.showDetails());
    System.out.println(s2.showDetails());
    System.out.println(s3.showDetails());
    System.out.println("========6========");
  }
}