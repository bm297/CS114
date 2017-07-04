   import java.util.Scanner;
   public class extraTest{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   
   //reading strings from user
   String bill = sc.nextLine();
   String sportsName = sc.nextLine();
   String movie = sc.nextLine();
   
   //calling objects
   SpeakerOfTheHouse speaker = new SpeakerOfTheHouse();
   SportsAnnouncer sports = new SportsAnnouncer();
   Actor actor = new Actor();
   
   //calling methods
   System.out.println(SpeakerOfTheHouse.speak());
   System.out.println(SpeakerOfTheHouse.announce(bill));
   
   System.out.println(SportsAnnouncer.speak());
   System.out.println(SportsAnnouncer.announce(sportsName));
   
   System.out.println(movie.speak());
   System.out.println(movie.announce(actor));
   }
   }