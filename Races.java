/**
 * Created by Spade on 6/4/2017.
 */
public class Races {
    HubPage hub = new HubPage();
    static String[] races = {"Dragonborn","Dwarf","Elf", "Gnome","Half-Elf", "Half-Orc", "Halfling", "Human","Tiefling"};
    public void dragonborn() {
        hub.str += 2;
        hub.cha++;

    }
    public void dwarf()
    {
        hub.con+=2;

    }
    public void elf()
    {
        hub.dex+=2;

    }
    public void gnome()
    {
        hub.inl+=2;
    }
    public void halfElf()
    {
        hub.cha+=2;
        for(int i =0;i<2;i++){
            System.out.println("What ability do you want +1'd?");
            String plusAbility = hub.in.nextLine();
            switch(plusAbility)
            {
                case "Strength":
                    hub.str++;
                    break;
                case "Dexterity":
                    hub.dex++;
                    break;
                case "Constitution":
                    hub.con++;
                    break;
                case "Intelligence":
                hub.inl++;
                    break;
                case "Wisdom":
                    hub.wis++;
                    break;
                case "Charisma":
                    hub.cha++;
                    break;
            }
        }
    }
    public void halfOrc()
    {
        hub.str+=2;
        hub.con++;
    }
    public void halfling()
    {
        hub.dex+=2;
    }
    public void human()
    {
        hub.str++;
        hub.dex++;
        hub.con++;
        hub.inl++;
        hub.wis++;
        hub.cha++;
    }
    public void tiefling()
    {
        hub.inl++;
        hub.cha+=2;
    }

}
