package src.Backend;

import java.util.HashMap;

public class Monster extends Pawn{
    private final MonsterType type;

    public Monster(String name,PawnSize size, MonsterType type, Alignment alignment, int AC, int HP, int reg_speed, int dig_speed, int fly_speed, int swim_speed,
                    int climb_speed, int str, int dex, int con, int it, int wis, int cha, HashMap<Attributes, Integer> saves_map,
                    HashMap<Skills, Integer> skills_map){
        this.set_name(name);
        this.set_size(size);
        this.type = type;
        this.set_alignment(alignment);
        this.set_AC(AC);
        this.set_HP(HP);
        this.set_all_speeds(reg_speed, dig_speed, fly_speed, swim_speed, climb_speed);
        this.set_attributes(str, dex, con, it, wis, cha);
        generate_attr_bonus();
        generate_save_bonus(saves_map);
    }

    public MonsterType get_type(){
        return this.type;
    }

    /**
     * 
     * @param saves_map HashMap representing WHICH saves differ from attribute bonuses and their values.
     * Loops 6 times (length of all attribute related arrays), gets attribute that is idintified by # of current loop (eg, on first loop, index is 0 and attribute is
     * therefore STRENGTH). If this attribute is in saves_map as a key, than add its value to the saves array, if not add value of attribute bonus with the same index 
     * to the saves array
     * 
     * TODO: test pls
     */
    public void generate_save_bonus(HashMap<Attributes, Integer> saves_map){
        for(int i = 0; i < this.get_attr_bonuses().length; i++){
            Attributes attr_from_index = Attributes.get_attribute_by_index(i);
            if(saves_map.containsKey(attr_from_index)){
                this.set_save_bonus(i, saves_map.get(attr_from_index));
            }
            else{
                this.set_save_bonus(i, this.get_attr_bonus(i));
            }
        }

    }

    /**
     * TODO: test pls
     */
    public void generate_skill_bonus(HashMap<Skills, Integer> skills_map){
        for(int i = 0; i < this.get_skill_bonuses().length; i++){
            Skills skill_from_index = Skills.get_skill_by_index(i);
            if(skills_map.containsKey(skill_from_index)){
                this.set_skill_bonus(i, skills_map.get(skill_from_index));
            }
            else{
                this.set_skill_bonus(i, this.get_attr_bonus(skill_from_index.get_attribute().get_index()));
            }
        }
    }

}