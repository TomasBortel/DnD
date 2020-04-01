package src.Backend;

public enum Skills{
     ATHLETICS(0),
     ACROBATICS(1),
     SNEAKING(2),
     SLEIGHT_OF_HAND(3),
     HISTORY(4),
     ARCANA(5),
     NATURE(6),
     INVESTIGATION(7),
     RELIGION(8),
     MEDICINE(9),
     INSIGHT(10),
     PERCEPTION(11),
     SURVIVAL(12),
     ANIM_HANDLING(13),
     PERSUASION(14),
     DECEPTION(15),
     INTIMIDATION(16),
     PERFORMANCE(17);

     private final int index;

     private Skills(int index){
         this.index = index;
     }

     public int get_index(){
         return this.index;
     }

    public static Skills get_skill_by_index(int index){
        if(index < 0 || index > 17){
            /**TODO throwing error will be better */
            System.out.println("index out of bounds");
            return null;
        }
        for(Skills skill : Skills.values()){
            if(skill.get_index() == index){
                return skill;
            }
        }
        return null;
    }
}