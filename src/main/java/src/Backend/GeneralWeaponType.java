package src.Backend;

public enum GeneralWeaponType{
    SIMPLE_MELEE,
    SIMPLE_RANGED,
    MARTIAL_MELEE,
    MARTIAL_RANGED;

    public String toString(){
        return this.name().toLowerCase().replace("_", ", ");
    }
}