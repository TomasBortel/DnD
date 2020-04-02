package src.Backend;

import java.util.HashMap;

public class Race{
    private String name;
    private String desc;
    private HashMap<Attributes,Integer> attr_bonus;
    private int base_speed;
    //TODO: FEATURES
    //TODO: CANTRIPS
    //TODO: SPELLS

    public Race(String name, String desc, HashMap<Attributes,Integer> attr_bonus, int base_speed){
        this.name = name;
        this.desc = desc;
        this.attr_bonus = attr_bonus;
        this.base_speed = base_speed;
    }

    public String get_name(){
        return this.name;
    }

    public String get_description(){
        return this.desc;
    }

    public HashMap<Attributes,Integer> get_attr_bonuns(){
        return this.attr_bonus;
    }

    public int get_base_speed(){
        return this.base_speed;
    }

}