package src.Backend;


public class Character extends Pawn{
    private int level = 1;
    private int exp_total = 0;
    private boolean inspiration = false;
    private int prof_bonus = 2;

    public Character(String name, Alignment alignment, int str, int dex, int con, int it, int wis, int cha, int AC){
        this.set_name(name);
        //TODO: Class
        //TODO: Race
        //TODO: Backround
        this.set_alignment(alignment);
        this.set_attributes(str, dex, con, it, wis, cha);
        //TODO: add racial bonuses.
        this.generate_attr_bonus();
        //TODO: saves are determined by proficiencies determined by CLASS
        //TODO: SKILLS, same as above + player can usually choose which skill he wants
        this.set_AC(AC); //TODO: determined more by items and attributes so maybe delete 
        //TODO: speed determined by race, gear and class?




    }

}