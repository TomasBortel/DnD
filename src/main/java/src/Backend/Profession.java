package src.Backend;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Represents CLASS class, but java is stupid, so...Profession.
 * TODO: When do I initialize these?
 */
public class Profession{
    private String name;
    private String description;
    private int hit_dice;
    private ArmorType[] armor_profs;
    private SpecificWeaponType[] weapon_profs;
    private Tools[] tool_profs;
    private Attributes[] save_bonus;
    private Skills[] possible_skill_profs;
    private int skill_profs_count;
    //TODO:starting gear
    private Attributes casting_attribute;
    //TODO: implement casting system? Wizard / Cleric,Paladin,Druid / Sorc,Lock,Bard systems?

    public Profession(String name, String desc, int hit_dice, ArmorType[] armor_profs, GeneralWeaponType[] gen_weapon_profs,
                        SpecificWeaponType[]spec_weapon_profs, Tools[] tool_profs, Attributes[] save_bonus, Skills[] possible_skill_profs,
                        int skill_profs_count, Attributes casting_attribute){

        this.name = name;
        this.description = desc;
        this.hit_dice = hit_dice;
        this.armor_profs = armor_profs;
        this.weapon_profs = get_all_weapon_profs(gen_weapon_profs, spec_weapon_profs);
        this.tool_profs = tool_profs;
        this.save_bonus = save_bonus;
        this.possible_skill_profs = possible_skill_profs;
        this.skill_profs_count = skill_profs_count;
        this.casting_attribute = casting_attribute;
    }

    private SpecificWeaponType[] get_all_weapon_profs(GeneralWeaponType[] gen_weapon_profs, SpecificWeaponType[] spec_weapon_profs){
        ArrayList<SpecificWeaponType> list = new ArrayList<SpecificWeaponType>(Arrays.asList(spec_weapon_profs));
        for(int i = 0; i<gen_weapon_profs.length; i++){
            GeneralWeaponType gen_weapon_prof = gen_weapon_profs[i];
            SpecificWeaponType[] spec_from_gen = gen_weapon_prof.get_weapons();
            list.addAll(Arrays.asList(spec_from_gen));
        }

        return (SpecificWeaponType[])list.toArray(); 
    }

    public String get_name(){
        return this.name;
    }

    public String get_description(){
        return this.description;
    }

    public int get_hit_dice(){
        return this.hit_dice;
    }

    public ArmorType[] get_armor_profs(){
        return this.armor_profs;
    }

    public SpecificWeaponType[] get_weapon_profs(){
        return this.weapon_profs;
    }

    public Tools[] get_tool_profs(){
        return this.tool_profs;
    }
    
    public Attributes[] get_save_bonus(){
        return this.save_bonus;
    }

    public Skills[] get_possible_skill_profs(){
        return this.possible_skill_profs;
    }

    public int get_skill_profs_count(){
        return this.skill_profs_count;
    }

    public Attributes get_casting_attribute(){
        return this.casting_attribute;
    }
    



}