package SacredsJourney;

import java.util.Date;

public class timeSleep
{
    public static void main(String[] args)
    {
        Secret();
       Testing();
 
    }


    static void Secret()
    {
        System.out.println("I am Sleeping!");
        try
        {
            Thread.sleep(3000); // 3 seconds
            System.out.println("Im awake again ");

            System.out.println("Lmao Ok this is funny");
        }
        catch(InterruptedException e)
        {
            System.err.print(e.getMessage());

        }
    }

    static void Testing()
    {
        try
        {
            Thread.sleep(2000); //2 seconds delay
            System.out.println("Hello How was your day?");

        }
        catch(InterruptedException e)
        {
            System.err.print(e.getMessage());

        }
    }
}