package src.Backend;


public enum Alignment{
    LAWFUL_GOOD,
    LAWFUL_NEUTRAL,
    LAWFUL_EVIL,
    NEUTRAL_GOOD,
    NEUTRAL,
    NEUTRAL_EVIL,
    CHAOTIC_GOOD,
    CHAOTIC_NEUTRAL,
    CHATORIC_EVIL;

    @Override
    public String toString(){
        return this.name().toLowerCase().replace("_", " ");
    }
}
