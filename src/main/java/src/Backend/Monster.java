package src.Backend;

public class Monster extends Pawn{
    private final MonsterType type;

    public Monster(MonsterType type){
        this.type = type;
        generate_attr_bonus();
    }

    public MonsterType get_type(){
        return this.type;
    }

}