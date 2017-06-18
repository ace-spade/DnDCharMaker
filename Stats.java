/**
 * Created by Spade on 6/4/2017.
 */

public class Stats {
    static int strMod,dexMod,conMod,inlMod,wisMod,chaMod;
    static HubPage hub = new HubPage();
    static Classes classes = new Classes();
    public static void setStr(){
        System.out.println("Enter your Strength");
        int pot = HubPage.sc.nextInt();
        if(pot<21 && pot >0)
        {
            HubPage.str += pot;
            strMod= HubPage.str -10;
            if(HubPage.str %2==1){
                strMod--;
            }
            strMod/=2;
        }
    }
    public static void setDex()
    {
        System.out.println("Enter your Dexterity");
        int pot = HubPage.sc.nextInt();
        if(pot<21 && pot >0)
        {
            HubPage.dex += pot;
            dexMod= HubPage.dex -10;
            if(HubPage.dex %2==1){
                dexMod--;
            }
            dexMod/=2;
        }
    }
    public static void setCon()
    {System.out.println("Enter your Constitution");
        int pot = HubPage.sc.nextInt();
        if(pot<21 && pot >0)
        {
            HubPage.con += pot;
            conMod= HubPage.con -10;
            if(HubPage.con %2==1){
                conMod--;
            }
            conMod/=2;
        }
    }
    public static void setInl()
    {System.out.println("Enter your Intelligence");
        int pot = HubPage.sc.nextInt();
        if(pot<21 && pot >0)
        {
            HubPage.inl += pot;
            inlMod= HubPage.inl -10;
            if(HubPage.inl %2==1){
                inlMod--;
            }
            inlMod/=2;
        }
    }
    public static void setWis()
    {System.out.println("Enter your Wisdom");
        int pot = HubPage.sc.nextInt();
        if(pot<21 && pot >0)
        {
            HubPage.wis += pot;
            wisMod= HubPage.wis -10;
            if(HubPage.wis %2==1){
                wisMod--;
            }
            wisMod/=2;
        }
    }
    public static void setCha()
    {System.out.println("Enter your Charisma");
        int pot = HubPage.sc.nextInt();
        if(pot<21 && pot >0)
        {
            HubPage.cha += pot;
            chaMod= HubPage.cha -10;

            if(HubPage.cha %2==1){
                chaMod--;
            }
            chaMod/=2;

        }
    }
    public static void setHp()
    {
        HubPage.hp = Classes.classHpBonus +conMod+(Classes.hpPlus * HubPage.level -1);
    }
}
