/**
 * Created by Spade on 6/4/2017.
 */
import java.util.Scanner;
public class HubPage {
    static Scanner sc = new Scanner(System.in);
    static Scanner in = new Scanner(System.in);


    static Stats stats = new Stats();
    static Races races = new Races();
    static Classes classes = new Classes();

    static String race,userClass,proficiencies="",name;
    static int raceChoice,level;
    static int str,dex,con,inl,wis,cha,hp;
    public static void displayChar()
    {
        System.out.println("Name: "+ name);
        System.out.println("Race: "+ race);
        System.out.println("Class: "+ userClass);
        System.out.println("Strength: "+str+","+stats.strMod);
        System.out.println("Dexterity: "+dex+","+stats.dexMod);
        System.out.println("Constitution: "+con+","+stats.conMod);
        System.out.println("Intelligence: "+inl+","+stats.inlMod);
        System.out.println("Wisdom: "+wis+","+stats.wisMod);
        System.out.println("Charisma: "+cha+","+stats.chaMod);
        System.out.println("HP: "+ hp);
        System.out.println("Level: "+level);
        System.out.println("Initiative: "+stats.dexMod);
        System.out.println(proficiencies);
    }
    public static void main(String[] args)
    {
        System.out.print("Enter your name: ");
        name = in.nextLine();

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
                race = "Dragonborn";
                System.out.println(race);
                break;
            case 2:
                races.dwarf();
                race = "Dwarf";
                System.out.println(race);
                break;
            case 3:
                races.elf();
                race = "Elf";
                System.out.println(race);
                break;
            case 4:
                races.gnome();
                race = "Gnome";
                System.out.println(race);
                break;
            case 5:
                races.halfElf();
                race = "Half-Elf";
                System.out.println(race);
                break;
            case 6:
                races.halfling();
                race = "Halfling";
                System.out.println(race);

                break;
            case 7:
                races.halfOrc();
                race = "Half-Orc";
                System.out.println(race);
                break;
            case 8:
                races.human();
                race = "Human";
                System.out.println(race);
                break;
            case 9:
                races.tiefling();
                race ="Tiefling";
                System.out.println(race);
                break;
        }
        System.out.println("Enter your stats");
        stats.setStr();
        stats.setDex();
        stats.setCon();
        stats.setInl();
        stats.setWis();
        stats.setCha();
        System.out.println("Choose your class");
        for(int i =0;i<12;i++)
        {
            System.out.println(classes.classes[i]);
           
        }
        System.out.println("Choose one from 1 to 12");
        int classChoice = sc.nextInt();
        switch (classChoice)
        {
            case 1:
                classes.barbarian();
                userClass="Barbarian";
                break;
            case 2:
                classes.bard();
                userClass="Bard";
                break;
            case 3:
                classes.cleric();
                userClass="Cleric";
                break;
            case 4:
                classes.druid();
                userClass="Druid";
                break;
            case 5:
                classes.fighter();
                userClass="Fighter";
                break;
            case 6:
                classes.monk();
                userClass="Monk";
                break;
            case 7:
                classes.paladin();
                userClass="Paladin";
                break;
            case 8:
                classes.ranger();
                userClass="Ranger";
                break;
            case 9:
                classes.rogue();
                userClass="Rogue";
                break;
            case 10:
                classes.sorceror();
                userClass="Sorceror";
                break;
            case 11:
                classes.warlock();
                userClass="Warlock";
                break;
            case 12:
                classes.wizard();
                userClass="Wizard";
                break;
        }
        stats.setHp();
        displayChar();
        String levelPlus="yes";
        while(levelPlus.contains("es")&&level<20)
        {
            System.out.println("Do you want to level up? (yes or no)");
            levelPlus = in.nextLine();
            if(levelPlus.contains("Y")||levelPlus.contains("Y"))
            {
                level++;
                displayChar();
                if(level==4)
                {
                    for(int i=0;i<2;i++)
                    {
                        System.out.println("What stat do you want to increase?");
                        String statChoice = in.nextLine();
                        switch(statChoice)
                        {
                            case ("Strength"):
                                str++;
                                break;
                            case ("Dexterity"):
                                dex++;
                                break;
                            case ("Constitution"):
                                con++;
                                break;
                            case ("Intelligence"):
                                inl++;
                                break;
                            case ("Wisdom"):
                                wis++;
                                break;
                            case ("Charisma"):
                                cha++;
                                break;
                        }
                    }
                }

            }

        }
    }

}
