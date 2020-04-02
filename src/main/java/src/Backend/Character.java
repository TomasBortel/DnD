package src.Backend;


public class Character extends Pawn{
    private Profession profession;
    private int level = 1;
    private int exp_total = 0;
    private boolean inspiration = false;
    private int prof_bonus;

    public Character(String name,Profession profession, Alignment alignment, int str, int dex, int con, int it, int wis, int cha, int AC){
        this.set_name(name);
        this.profession = profession;
        //TODO: Race
        //TODO: Backround
        this.set_alignment(alignment);
        this.set_attributes(str, dex, con, it, wis, cha);
        //TODO: add racial bonuses.
        this.generate_attr_bonus();
        this.generate_saves();
        //TODO: SKILLS, same as above + player can usually choose which skill he wants
        this.set_AC(AC); //TODO: determined more by items and attributes so maybe delete 
        //TODO: speed determined by race, gear and class?
        this.generate_prof_bonus();




    }

    public Profession get_profession(){
        return this.profession;
    }

    public int get_level(){
        return this.level;
    }

    public int get_total_exp(){
        return this.exp_total;
    }

    public void set_total_exp(int how_much){
        this.exp_total = how_much;
    }

    public void add_exp(int how_much){
        this.exp_total += how_much;
    }

    public boolean has_inspiration(){
        return this.inspiration;
    }

    public int get_prof_bonus(){
        return this.prof_bonus;
    }

    public void generate_prof_bonus(){
        if(level<5){
            this.prof_bonus = 2;
        }else if(level >= 5 && level < 9){
            this.prof_bonus = 3;
        }else if(level >= 9 && level <13){
            this.prof_bonus = 4;
        }else if(level>=13 && level < 17){
            this.prof_bonus = 5;
        }else{this.prof_bonus = 6;}

    }


    private void generate_saves(){
        Attributes[] class_bonus = this.profession.get_save_bonus();
        for(int i = 0; i < this.get_save_bonuses().length; i++){
            Attributes attribute_by_index = Attributes.get_attribute_by_index(i);
            int value = get_attr_bonus(i);
            if(attribute_by_index.equals(class_bonus[0]) || attribute_by_index.equals(class_bonus[1])){
                value += this.prof_bonus;
            }
            this.set_save_bonus(i, value);
        }
    }

}