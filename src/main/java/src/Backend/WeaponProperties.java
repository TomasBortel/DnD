package src.Backend;

public enum WeaponProperties{
    AMMUNITION,
    FINESSE,
    HEAVY,
    LIGHT,
    LOADING,
    RANGE,
    REACH,
    SPECIAL,
    THROWN,
    TWO_HANDED,
    VERSATILE,
    IMPROVISED,
    SILVERED;

    //TODO: add descriptions (load from file)

    public String toString(){
        return this.name().toLowerCase().replace("_", "");
    }

}