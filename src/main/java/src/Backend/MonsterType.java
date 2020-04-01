package src.Backend;

public enum MonsterType{
    ABBERATION,
    BEAST,
    CELESTIAL,
    CONSTRUCT,
    DRAGON,
    ELEMENTAL,
    FEY,
    FIEND,
    GIANT,
    HUMANOID,
    MONSTROSITY,
    OOZE,
    PLANT,
    SWARM,
    UNDEAD;

    @Override
    public String toString(){
        return this.name().toLowerCase();
    }
}