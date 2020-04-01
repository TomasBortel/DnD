package src.Backend;

public enum Attributes{
    STRENGTH("STR", 0),
    DEXTERITY("DEX", 1),
    CONSTITUTION("CON", 2),
    INTELLIGENCE("INT", 3),
    WISDOM("WIS", 4),
    CHARISMA("CHA", 5);

    private final String abbreviation;
    private final int index;

    private Attributes(String abb, int index){
        this.abbreviation = abb;
        this.index = index;
    }

    public int get_index(){
        return this.index;
    }

    public String get_abbreviation(){
        return this.abbreviation;
    }


    /**Method that gets enum value from input index. Index needs to be in interval <0;5> */
    public static Attributes get_attribute_by_index(int index){
        if(index < 0 || index > 5){
            /**TODO throwing error will be better */
            System.out.println("index out of bounds");
            return null;
        }
        for(Attributes attribute : Attributes.values()){
            if(attribute.get_index() == index){
                return attribute;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        return this.name().toLowerCase();
    }

}