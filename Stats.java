/**
 * Created by Spade on 6/4/2017.
 */

public class Stats {
    static int str,dex,con,inl,wis,cha,hp;
    static int strMod,dexMod,conMod,inlMod,wisMod,chaMod;
    static HubPage hub = new HubPage();
    static Classes classes = new Classes();
    public static void setStr(){
        System.out.println("Enter your Strength");
        int pot = hub.sc.nextInt();
        if(pot>20 && pot <0)
        {
            str += pot;
        }
    }
    public static void setDex()
    {
        System.out.println("Enter your Dexterity");
        int pot = hub.sc.nextInt();
        if(pot>20 && pot <0)
        {
            dex += pot;
        }
    }
    public static void setCon()
    {System.out.println("Enter your Constitution");
        int pot = hub.sc.nextInt();
        if(pot>20 && pot <0)
        {
            con += pot;
        }
    }
    public static void setInl()
    {System.out.println("Enter your Intelligence");
        int pot = hub.sc.nextInt();
        if(pot>20 && pot <0)
        {
            inl += pot;
        }
    }
    public static void setWis()
    {System.out.println("Enter your Wisdom");
        int pot = hub.sc.nextInt();
        if(pot>20 && pot <0)
        {
            wis += pot;
        }
    }
    public static void setCha()
    {System.out.println("Enter your Charisma");
        int pot = hub.sc.nextInt();
        if(pot>20 && pot <0)
        {
            cha += pot;
        }
    }
    public static void setHp()
    {
        hp = classes.classHpBonus+conMod;
    }
}
