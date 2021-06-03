package SacredsJourney.Storyline;
//-------------------------------
import java.util.Scanner;



public class Storyline1
{
  public static String L_Name;
  public static void main(String[] args)
  {
  Scanner F_Name = new Scanner(System.in);
  System.out.println("Enter your Username: ");

  L_Name = F_Name.nextLine();

  System.out.println("Your name is " + L_Name);
  p_STORY();

  

  }



  static void p_STORY()
  {
   
    try
    {
      Thread.sleep(1000);
      System.out.println("You just woke up from your nap");
      Thread.sleep(3000);
      System.out.println(L_Name + ": What Happened?"); // Fix this line later
      Thread.sleep(2000);
      System.out.print("dawd");
      Thread.sleep(2000);
      Thread.sleep(2000);
      Thread.sleep(2000);
      Thread.sleep(2000);
      Thread.sleep(2000);
      Thread.sleep(2000);


    }
    catch(InterruptedException e)
    {
      System.err.print(e.getMessage());
    }
  

  }
}

