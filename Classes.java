/**
 * Created by Spade on 6/4/2017.
 */
public class Classes {
    static HubPage hub = new HubPage();
    static int classHpBonus;
    static int hpPlus;
    static String HitDice;
    static String[] classes = {"Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "ranger", "rogue","sorceror","warlock","wizard"};
    static void barbarian()
    {
        classHpBonus=12;
        HitDice="1d12 per level";
        hpPlus=7;
        HubPage.proficiencies +="Armor: Light Armor, Medium Armor, shields Weapons: Simple Weapons, martial Weapons Tools: None\n"+
        "Saving Throws: Strength, Constitution\n"+
        "Skills: Choose two from Animal Handling, Athletics, Intimidation, Nature, Perception, and Survival";
    }
     static void bard()
    {
        classHpBonus=8;
        HitDice="1d8 per level";
        hpPlus=5;
        HubPage.proficiencies +="Armor: Light Armor\n" +
                "Weapons: simple Weapons, hand crossbows, longswords, rapiers, shortswords\n" +
                "Tools: three musical instruments of your choice\n" +
                "Skills: Choose any three.\n";
    }
     static void cleric()
    {
        classHpBonus=8;
        HitDice="1d8 per level";
        hpPlus=5;
        HubPage.proficiencies +="Armor: Light Armor, Medium Armor, shields\n" +
                "Weapons: simple Weapons\n" +
                "Tools: none\n" +
                "Skills: Choose two from History, Insight, Medicine, Persuasion, and Religion";
    }
    static void druid()
    {
        classHpBonus=8;
        HitDice="1d8 per level";
        hpPlus=5;
        HubPage.proficiencies +="Armor: Light Armor, Medium Armor, shields (druids will not wear armor or use shields made of metal)\n" +
                "Weapons: clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, spears\n" +
                "Tools: Herbalism kit\n" +
                "Skills: Choose two from Arcana, Animal Handling, Insight, Medicine, Nature, Perception, Religion, and Survival";
    }
     static void fighter()
    {
        classHpBonus=10;
        HitDice="1d10 per level";
        hpPlus=6;
        HubPage.proficiencies +="Armor: Light Armor, Medium Armor, Heavy Armor, shields\n" +
                "Weapons: simple Weapons, martial Weapons\n" +
                "Tools: none\n" +
                "Skills: Choose two skills from Acrobatics, Animal Handling, Athletics, History, Insight, Intimidation, Perception, and Survival\n";

    }
     static void monk()
    {
        classHpBonus=8;
        HitDice="1d8 per level";
        hpPlus=5;
        HubPage.proficiencies +="Armor: none\n" +
                "Weapons: simple Weapons, shortswords\n" +
                "Tools: any one type of artisan's tools or any one musical instrument of your choice\n" +
                "Skills: Choose two from Acrobatics, Athletics, History, Insight, Religion, and Stealth";
    }
    static void paladin()
    {
        classHpBonus=10;
        HitDice="1d10 per level";
        hpPlus=6;
        HubPage.proficiencies +="Armor: Light Armor, Medium Armor, Heavy Armor, shields\n" +
                "Weapons: simple Weapons, martial Weapons\n" +
                "Tools: none\n" +
                "Skills: Choose two from Athletics, Insight, Intimidation, Medicine, Persuasion, and Religion";
    }
     static void ranger()
    {

        classHpBonus=10;
        HitDice="1d10 per level";
        hpPlus=6;
        HubPage.proficiencies +="Armor: Light Armor, Medium Armor, shields\n" +
                "Weapons: simple Weapons, martial Weapons\n" +
                "Tools: none\n" +
                "Skills: Choose three from Animal Handling, Athletics, Insight, Investigation, Nature, Perception, Stealth, and Surviva";

    }
     static void rogue()
    {
        classHpBonus=8;
        HitDice="1d8 per level";
        hpPlus=5;
        HubPage.proficiencies +="Armor: Light Armor\n" +
                "Weapons: simple Weapons, hand crossbows, longswords, rapiers, shortswords\n" +
                "Tools: Thieves' Tools\n" +
                "Skills: Choose four from Acrobatics, Athletics, Deception, Insight, Intimidation, Investigation, Perception, Performance. Persuasion, Sleight of Hand, and Stealth";
    }
     static void sorceror()
    {
        classHpBonus=6;
        HitDice="1d6 per level";
        hpPlus=4;
        HubPage.proficiencies +="Armor: none\n" +
                "Weapons: daggers, darts, slings, quarterstaffs, light crossbows\n" +
                "Tools: none\n" +
                "Skills: Choose two from Arcana, Deception, Insight, Intimidation, Persuasion, and Religion";
    }
    static void warlock()
    {
        classHpBonus=8;
        HitDice="1d8 per level";
        hpPlus=5;
        HubPage.proficiencies +="Armor: Light Armor\n" +
                "Weapons: simple Weapons\n" +
                "Tools: none\n" +
                "Skills: Choose two skills from Arcana, Deception, History, Intimidation, Investigation, Nature, and Religion";
    }
     static void wizard()
    {
        classHpBonus=6;
        HitDice="1d6 per level";
        hpPlus=4;
        HubPage.proficiencies +="Armor: none\n" +
                "Weapons: daggers, darts, slings, quarterstaffs, light crossbows\n" +
                "Tools: none\n" +
                "Skills: Choose two from Arcana, History, Insight, Investigation, Medicine, and Religion";
    }

}
