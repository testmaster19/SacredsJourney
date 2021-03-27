package SacredsJourney.Dungeon;
/*
Will have a dungeon story line entry
Mobs will show here
create multiple mobs in place
Mob encounter will be an arraylist/random array

*/
import java.util.ArrayList;


public class SDungeon
{

    /*
    Put ints here 



    */




    public static void main(String[]arg)
    {
        System.out.println("Hello From Dungeon");
        Monsters();
    }




    static void Monsters()
    {
        ArrayList<String> S_Monster = new ArrayList<String>();
        S_Monster.add("Monster Type1");
        S_Monster.add("Demonload");
        S_Monster.add("Guard5");
        S_Monster.add("5");
        S_Monster.add("Monster Type1");
        System.out.println(S_Monster);

    }

    
}