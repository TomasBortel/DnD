package src.Backend;

public enum Skills{
     ATHLETICS(0, Attributes.STRENGTH),
     ACROBATICS(1, Attributes.DEXTERITY),
     SNEAKING(2, Attributes.DEXTERITY),
     SLEIGHT_OF_HAND(3, Attributes.DEXTERITY),
     HISTORY(4, Attributes.INTELLIGENCE),
     ARCANA(5, Attributes.INTELLIGENCE),
     NATURE(6, Attributes.INTELLIGENCE),
     INVESTIGATION(7, Attributes.INTELLIGENCE),
     RELIGION(8, Attributes.INTELLIGENCE),
     MEDICINE(9, Attributes.WISDOM),
     INSIGHT(10, Attributes.WISDOM),
     PERCEPTION(11, Attributes.WISDOM),
     SURVIVAL(12, Attributes.WISDOM),
     ANIM_HANDLING(13, Attributes.WISDOM),
     PERSUASION(14, Attributes.CHARISMA),
     DECEPTION(15, Attributes.CHARISMA),
     INTIMIDATION(16, Attributes.CHARISMA),
     PERFORMANCE(17, Attributes.CHARISMA);

     private final int index;
     private final Attributes base_attribute;

     private Skills(int index, Attributes attribute){
         this.index = index;
         this.base_attribute = attribute;
     }

     public int get_index(){
         return this.index;
     }

     public Attributes get_attribute(){
         return this.base_attribute;
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

    public String toString(){
        return this.name().toLowerCase().replace("_", " ");
    }
}