package src.Backend;

public enum GeneralWeaponType{
    SIMPLE_MELEE(new SpecificWeaponType[]{SpecificWeaponType.CLUB, SpecificWeaponType.DAGGER, SpecificWeaponType.GREATCLUB,SpecificWeaponType.HANDAXE,
                                        SpecificWeaponType.JAVELIN,SpecificWeaponType.LIGHT_HAMMER,SpecificWeaponType.MACE,SpecificWeaponType.QUARTERSTAFF,
                                        SpecificWeaponType.SICKLE,SpecificWeaponType.SPEAR}),
    SIMPLE_RANGED(new SpecificWeaponType[]{SpecificWeaponType.LIGHT_CROSSBOW,SpecificWeaponType.DART,SpecificWeaponType.SHORTBOW,SpecificWeaponType.SLING}),
    MARTIAL_MELEE(new SpecificWeaponType[]{SpecificWeaponType.BATTLEAXE,SpecificWeaponType.FLAIL,SpecificWeaponType.GLAIVE,SpecificWeaponType.GREATAXE,
                                        SpecificWeaponType.GREATSWORD,SpecificWeaponType.HALBERD,SpecificWeaponType.LANCE,SpecificWeaponType.LONGSWORD,
                                        SpecificWeaponType.MAUL,SpecificWeaponType.MORNINGSTAR,SpecificWeaponType.PIKE,SpecificWeaponType.RAPIER,
                                        SpecificWeaponType.SCIMITAR,SpecificWeaponType.SHORTSWORD,SpecificWeaponType.TRIDENT,SpecificWeaponType.WAR_PICK,
                                        SpecificWeaponType.WARHAMMER,SpecificWeaponType.WHIP}),
    MARTIAL_RANGED(new SpecificWeaponType[]{SpecificWeaponType.BLOWGUN,SpecificWeaponType.HAND_CROSSBOW,SpecificWeaponType.HEAVY_CROSSBOW,
                                            SpecificWeaponType.LONGBOW,SpecificWeaponType.NET});

    private SpecificWeaponType[] weapons;

    private GeneralWeaponType(SpecificWeaponType[] weapons){
        this.weapons = weapons;
    }

    public String toString(){
        return this.name().toLowerCase().replace("_", ", ");
    }
    

    public SpecificWeaponType[] get_weapons(){
        return this.weapons;
    }
}