package src.Backend;

import java.util.HashMap;

public class Character extends Pawn{
    private Profession profession;
    private Race race;
    private Backround backround;
    private int level = 1;
    private int exp_total = 0;
    private boolean inspiration = false;
    private int prof_bonus;
    private boolean can_level_up;

    public Character(String name,Profession profession,Race race,Backround backround, Alignment alignment, int str, int dex, int con, int it,
                    int wis, int cha, int AC){
        this.set_name(name);
        this.profession = profession;
        this.race = race; //is subrace a race or something else?
        this.backround = backround;
        this.set_alignment(alignment);
        this.set_attributes(str, dex, con, it, wis, cha);
        this.add_racial_bonuses();
        this.generate_attr_bonus();
        this.generate_saves();
        //TODO: SKILLS, same as above + player can usually choose which skill he wants
        this.set_AC(AC); //TODO: determined more by items and attributes so maybe delete 
        this.set_speed(0, this.race.get_base_speed()); //TODO: WHAT ABOUT OTHER RACES, WHAT ABOUT SPEED GIVEN BY SPECIAL ABILITIES, SPELLS AND FEATS
        this.generate_prof_bonus();
        this.set_HP_max(this.profession.get_hit_dice()+this.get_attr_bonus(2));
    }

    public Profession get_profession(){
        return this.profession;
    }

    public Race get_race(){
        return this.race;
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

    public boolean get_can_level_up(){
        return this.can_level_up;
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

    private void add_racial_bonuses(){
        for(int i = 0; i < this.get_attributes().length; i++){
            Attributes att_from_index = Attributes.get_attribute_by_index(i);
            HashMap<Attributes, Integer> racial_bonus_map = this.race.get_attr_bonuns();
            if(racial_bonus_map.containsKey(att_from_index)){
                int new_value = this.get_attribute(i) + racial_bonus_map.get(att_from_index);
                this.set_attribute(i, new_value);
            }
            
        }
    }

    public void can_level_up(){
        //TODO: add IF Milestone_progression_system THAN false
        if(level == 1 && exp_total >= 300){can_level_up = true;}
        else if(level == 2 && exp_total >= 900){can_level_up = true;}
        else if(level == 3 && exp_total >= 2700){can_level_up = true;}
        else if(level == 4 && exp_total >= 6500){can_level_up = true;}
        else if(level == 5 && exp_total >= 14000){can_level_up = true;}
        else if(level == 6 && exp_total >= 23000){can_level_up = true;}
        else if(level == 7 && exp_total >= 34000){can_level_up = true;}
        else if(level == 8 && exp_total >= 48000){can_level_up = true;}
        else if(level == 9 && exp_total >= 64000){can_level_up = true;}
        else if(level == 10 && exp_total >= 85000){can_level_up = true;}
        else if(level == 11 && exp_total >= 100000){can_level_up = true;}
        else if(level == 12 && exp_total >= 120000){can_level_up = true;}
        else if(level == 13 && exp_total >= 140000){can_level_up = true;}
        else if(level == 14 && exp_total >= 165000){can_level_up = true;}
        else if(level == 15 && exp_total >= 195000){can_level_up = true;}
        else if(level == 16 && exp_total >= 225000){can_level_up = true;}
        else if(level == 17 && exp_total >= 265000){can_level_up = true;}
        else if(level == 18 && exp_total >= 305000){can_level_up = true;}
        else if(level == 19 && exp_total >= 355000){can_level_up = true;}
        else{can_level_up = false;}
    }

}