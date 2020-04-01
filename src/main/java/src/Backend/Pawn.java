package src.Backend;

public abstract class Pawn{
    private String name;
    private int HP;
    private int HP_temp = 0;
    private int AC;

    /**
     * Speed is represented by array, where each index represents one type of speed. Speed represented this way is always in FEET.
     * 0 - WALKING/RUNNING
     * 1 - DIGGING
     * 2 - FLYING
     * 3 - SWIMMING
     * 4 - CLIMBING
     */
    private int[] speed = new int[5];

    /**
     * Attributes, attribute  and save bonuses are represented by arrays, where each index always represents one attribute.
     * 0 - STRENGTH
     * 1 - DEXTERITY
     * 2 - CONSTITUTION
     * 3 - INTELLIGENCE
     * 4 - WISDOM
     * 5 - CHARISMA
     */
    private int[] attributes = new int[]{1,2,3,4,5,6};
    private int[] attr_bonus = new int[6];
    private int[] save_bonus = new int[6];

    /**
     * Alignment is represented by enum.
     * TODO: lawful/chaotic and good/evil scale, that determines pawn's alignment.
     */
    private Alignment alignment;

    /**
     * Pawn size is represented by an enum. Each unit has a numerical value (0 to 5) for easy comparing.
     */
    private PawnSize size;

    /**
     * Skill bonuses are represented by an array.
     * 0 - Athletics
     * 1 - Acrobatics
     * 2 - Sneaking
     * 3 - Sleigh of hand
     * 4 - History
     * 5 - Arcana
     * 6 - Nature
     * 7 - Investigation
     * 8 - Religion
     * 9 - Medicine
     * 10 - Insight
     * 11 - Perception
     * 12 - Survival
     * 13 - Animal handling
     * 14 - persuasion
     * 15 - deception
     * 16 - intimidation
     * 17 - Performance
     */
    private int[] skill_bonus = new int[18];

    public String get_name(){
        return this.name;
    }

    public void set_name(String new_name){
        this.name = new_name;
    }

    public int get_HP(){
        return this.HP;
    }

    public void set_HP(int new_value){
        this.HP = new_value;
    }

    public void add_HP(int how_much){
        this.HP += how_much;
    }

    public int get_HP_temp(){
        return this.HP_temp;
    }

    public void set_HP_temp(int new_value){
        this.HP_temp = new_value;
    }

    public int get_AC(){
        return this.AC;
    }

    public void set_AC(int new_value){
        this.AC = new_value;
    }

    public int get_speed(int index){
        return this.speed[index];
    }

    public int[] get_all_speeds(){
        return this.speed;
    }

    public void set_speed(int index, int value){
        this.speed[index] = value;
    }

    public int[] get_attributes(){
        return this.attributes;
    }

    public int get_attribute(int index){
        return attributes[index];
    }

    public void set_attributes(int str, int dex, int con, int it, int wis, int cha){
        attributes = new int[]{str,dex,con,it,wis,cha};
        generate_attr_bonus();
    }

    public void set_attribute(int index, int new_value){
        attributes[index] = new_value;
        generate_attr_bonus();
    }

    public int[] get_attr_bonuses(){
        return attr_bonus;
    }

    public int get_attr_bonus(int index){
        return attr_bonus[index];
    }

    public int[] get_save_bonuses(){
        return save_bonus;
    }

    public int get_save_bonus(int index){
        return save_bonus[index];
    }

    public Alignment get_alignment(){
        return this.alignment;
    }

    public void set_alignment(Alignment alignment){
        this.alignment = alignment;
    }

    public void generate_attr_bonus(){
        for (int i = 0; i < attributes.length; i++){
            final int attr_val = attributes[i];
            if (attr_val == 0){
                attr_bonus[i] = -5;
            }
            else if(attr_val >= 10){
                attr_bonus[i] = (attr_val - 10) / 2;
            }
            else{
                attr_bonus[i] = (attr_val / 2) - 5;
            }
        }
    }

    public PawnSize get_size(){
        return this.size;
    }

    public void set_size(PawnSize size){
        this.size = size;
    }

    public int[] get_skill_bonuses(){
        return this.skill_bonus;
    }

    public int get_skill_bonus(int index){
        return this.skill_bonus[index];
    }

    public void set_skill_bonus(int index, int value){
        this.skill_bonus[index] = value;
    }

}