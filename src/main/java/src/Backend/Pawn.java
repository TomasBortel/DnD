package src.Backend;

public class Pawn{
    private int HP;
    private int AC;
    private int speed;
    private int[] attributes = new int[6];
    private int[] attr_bonus = new int[6];
    private int[] save_bonus = new int[6];

    public Pawn(){
        generate_attr_bonus();
    }

    public int get_HP(){
        return this.HP;
    }

    public void set_HP(int new_value){
        this.HP = new_value;
    }

    public int get_AC(){
        return this.AC;
    }

    public void set_AC(int new_value){
        this.AC = new_value;
    }

    public int get_speed(){
        return this.speed;
    }

    public void set_speed(int new_value){
        this.speed = new_value;
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

    public static void main(final String[] args){
        
    }

}