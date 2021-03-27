package SacredsJourney;
//-------------------------------
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class PlayerCreation
{
  public static void main(String[] args)
  {
  Scanner F_Name = new Scanner(System.in);
  System.out.println("Enter your Username: ");

  String L_Name = F_Name.nextLine();

  System.out.println("Your name is " + L_Name);


  }


  static void TimeSleep()
  {
    Thread.sleep(1000);
    System.out.println("Good morning")
    Thread.sleep(3000);
    System.out.println("Just woke up from my nap.");

  }
}
