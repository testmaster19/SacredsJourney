package SacredsJourney.PlayerStatus;

public class HPMPStats {


    final int HealthBar = 0;
    final int MagicBar = 0;
    private int z;






    public void HP_Bar()
    {

        //HP BAr here Gpes dpwm
        if(HealthBar < 100)
        {
            System.out.println("You have died");

        }
    }

    public void MP_Bar()
    {

        
        if(MagicBar < 100)
        {
            System.out.println("You ran out of mana");
            //Changing
        }
        
        
    }
    
}
