/**
 * Created by Spade on 6/4/2017.
 */
import java.util.Scanner;
public class HubPage {
    static Scanner sc = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);
    static Stats stats = new Stats();
    static Races races = new Races();
    static int raceChoice;
    static int str,dex,con,inl,wis,cha,hp;
    public static void main(String[] args)
    {
        System.out.println("Enter your stats");
        stats.setStr();
        str+=stats.str;
        stats.setDex();
        dex+=stats.dex;
        stats.setCon();
        con+=stats.con;
        stats.setInl();
        inl+=stats.inl;
        stats.setWis();
        wis+=stats.wis;
        stats.setCha();
        cha+=stats.cha;
        System.out.println("Choose a race");
        for(int i =0;i<9;i++)
        {
            System.out.println(races.races[i]);
        }
        System.out.println("Choose one from 1 to 9");
        raceChoice = sc.nextInt();
        switch (raceChoice)
        {
            case 1:
                races.dragonborn();
                break;
            case 2:
                races.dwarf();
                break;
            case 3:
                races.elf();
                break;
            case 4:
                races.gnome();
                break;
            case 5:
                races.halfElf();
                break;
            case 6:
                races.halfling();
                break;
            case 7:
                races.halfOrc();
                break;
            case 8:
                races.human();
                break;
            case 9:
                races.tiefling();
                break;
        }
    }

}
