package src.Backend;

public enum Languages{
    ABYSSAL,
    AQUAN,
    AURAN,
    CELESTIAL,
    COMMON,
    DEEP_SPEECH,
    DRACONIC,
    DRUIDIC,
    DWARVISH,
    ELVISH,
    GIANT,
    GNOMISH,
    GOBLIN,
    GNOLL,
    HALFLING,
    IGNAN,
    INFERNAL,
    ORC,
    PRIMORDIAL,
    SYLVAN,
    TERRAN,
    UNDERCOMMON;


    public String toString(){
        return this.name().toLowerCase().replace("_", " ");
    }
}



