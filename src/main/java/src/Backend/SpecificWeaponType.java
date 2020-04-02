package src.Backend;

public enum SpecificWeaponType{
    CLUB(GeneralWeaponType.SIMPLE_MELEE, 4,1, DamageType.BLUDGEONING,0, new WeaponProperties[]{WeaponProperties.LIGHT}),
    DAGGER(GeneralWeaponType.SIMPLE_MELEE, 4,1, DamageType.PIERCING,0,60,20,
            new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.LIGHT, WeaponProperties.THROWN}),
    GREATCLUB(GeneralWeaponType.SIMPLE_MELEE, 8,1, DamageType.BLUDGEONING,0, new WeaponProperties[]{WeaponProperties.TWO_HANDED}),
    HANDAXE(GeneralWeaponType.SIMPLE_MELEE, 6,1, DamageType.SLASHING,0, 60, 20, new WeaponProperties[]{WeaponProperties.LIGHT, WeaponProperties.THROWN}),
    JAVELIN(GeneralWeaponType.SIMPLE_MELEE, 6,1, DamageType.PIERCING,0, 120, 30, new WeaponProperties[]{WeaponProperties.THROWN}),
    LIGHT_HAMMER(GeneralWeaponType.SIMPLE_MELEE, 4,1, DamageType.BLUDGEONING,0, 60, 20, new WeaponProperties[]{WeaponProperties.LIGHT, WeaponProperties.THROWN}),
    MACE(GeneralWeaponType.SIMPLE_MELEE, 6,1, DamageType.BLUDGEONING,0, new WeaponProperties[]{}),
    QUARTERSTAFF(GeneralWeaponType.SIMPLE_MELEE, 6,1, DamageType.BLUDGEONING,8, new WeaponProperties[]{WeaponProperties.VERSATILE}),
    SICKLE(GeneralWeaponType.SIMPLE_MELEE,4,1,DamageType.SLASHING,0, new WeaponProperties[]{WeaponProperties.LIGHT}),
    SPEAR(GeneralWeaponType.SIMPLE_MELEE,6,1,DamageType.PIERCING,8,60,20, new WeaponProperties[]{WeaponProperties.THROWN, WeaponProperties.VERSATILE}),
    LIGHT_CROSSBOW(GeneralWeaponType.SIMPLE_RANGED, 8, 1, DamageType.PIERCING,0, 320, 80,
            new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.LOADING, WeaponProperties.TWO_HANDED}),
    DART(GeneralWeaponType.SIMPLE_RANGED, 4, 1, DamageType.PIERCING,0, 60, 20, new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.THROWN}),
    SHORTBOW(GeneralWeaponType.SIMPLE_RANGED, 6, 1, DamageType.PIERCING,0, 320, 80, new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.TWO_HANDED}),
    SLING(GeneralWeaponType.SIMPLE_RANGED, 4, 1, DamageType.BLUDGEONING,0, 120, 30, new WeaponProperties[]{WeaponProperties.AMMUNITION}),
    BATTLEAXE(GeneralWeaponType.MARTIAL_MELEE, 8, 1, DamageType.SLASHING,10, new WeaponProperties[]{WeaponProperties.VERSATILE}),
    FLAIL(GeneralWeaponType.MARTIAL_MELEE, 8, 1, DamageType.BLUDGEONING,0, new WeaponProperties[]{}),
    GLAIVE(GeneralWeaponType.MARTIAL_MELEE,10 ,1, DamageType.SLASHING, 0,
            new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.REACH, WeaponProperties.TWO_HANDED}),
    GREATAXE(GeneralWeaponType.MARTIAL_MELEE, 12, 1, DamageType.SLASHING,0, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.TWO_HANDED}),
    GREATSWORD(GeneralWeaponType.MARTIAL_MELEE, 6, 2, DamageType.SLASHING,0, new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.TWO_HANDED}),
    HALBERD(GeneralWeaponType.MARTIAL_MELEE, 10, 1,DamageType.SLASHING,0,
            new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.REACH, WeaponProperties.TWO_HANDED}),
    LANCE(GeneralWeaponType.MARTIAL_MELEE,12,1,DamageType.PIERCING,0,new WeaponProperties[]{WeaponProperties.REACH, WeaponProperties.SPECIAL}),
    LONGSWORD(GeneralWeaponType.MARTIAL_MELEE,8,1,DamageType.SLASHING,10,new WeaponProperties[]{WeaponProperties.VERSATILE}),
    MAUL(GeneralWeaponType.MARTIAL_MELEE,6,2,DamageType.BLUDGEONING,0,new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.TWO_HANDED}),
    MORNINGSTAR(GeneralWeaponType.MARTIAL_MELEE,8,1,DamageType.PIERCING,0,new WeaponProperties[]{}),
    PIKE(GeneralWeaponType.MARTIAL_MELEE,10,1,DamageType.PIERCING,0,
            new WeaponProperties[]{WeaponProperties.HEAVY, WeaponProperties.REACH, WeaponProperties.TWO_HANDED}),
    RAPIER(GeneralWeaponType.MARTIAL_MELEE,8,1,DamageType.PIERCING,0,new WeaponProperties[]{WeaponProperties.FINESSE}),
    SCIMITAR(GeneralWeaponType.MARTIAL_MELEE,6,1,DamageType.SLASHING,0,new WeaponProperties[]{WeaponProperties.LIGHT, WeaponProperties.FINESSE}),
    SHORTSWORD(GeneralWeaponType.MARTIAL_MELEE,6,1,DamageType.PIERCING,0,new WeaponProperties[]{WeaponProperties.LIGHT, WeaponProperties.FINESSE}),
    TRIDENT(GeneralWeaponType.MARTIAL_MELEE,6,1,DamageType.PIERCING,8,60,20,new WeaponProperties[]{WeaponProperties.VERSATILE, WeaponProperties.THROWN}),
    WAR_PICK(GeneralWeaponType.MARTIAL_MELEE,8,1,DamageType.PIERCING,0,new WeaponProperties[]{}),
    WARHAMMER(GeneralWeaponType.MARTIAL_MELEE,8,1,DamageType.BLUDGEONING,10,new WeaponProperties[]{WeaponProperties.VERSATILE}),
    WHIP(GeneralWeaponType.MARTIAL_MELEE,4,1,DamageType.SLASHING,0,new WeaponProperties[]{WeaponProperties.FINESSE, WeaponProperties.REACH}),
    BLOWGUN(GeneralWeaponType.MARTIAL_RANGED,0,0,DamageType.PIERCING,1,100,25,new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.LOADING}),
    HAND_CROSSBOW(GeneralWeaponType.MARTIAL_RANGED,6,1,DamageType.PIERCING,0,120,30,
            new WeaponProperties[]{WeaponProperties.AMMUNITION,WeaponProperties.LOADING, WeaponProperties.LIGHT}),
    HEAVY_CROSSBOW(GeneralWeaponType.MARTIAL_RANGED,10,1,DamageType.PIERCING,0,400,100,
            new WeaponProperties[]{WeaponProperties.AMMUNITION,WeaponProperties.LOADING, WeaponProperties.HEAVY,WeaponProperties.TWO_HANDED}),
    LONGBOW(GeneralWeaponType.MARTIAL_RANGED,8,1,DamageType.PIERCING,0,600,150,
            new WeaponProperties[]{WeaponProperties.AMMUNITION, WeaponProperties.HEAVY,WeaponProperties.TWO_HANDED}),
    NET(GeneralWeaponType.MARTIAL_RANGED,0,0,null,0,15,5,new WeaponProperties[]{WeaponProperties.SPECIAL, WeaponProperties.THROWN});

    private final GeneralWeaponType group;
    private final int dmg_dice;
    private final int dice_count;
    private final DamageType dmg_type;
    private final int variant_dmg;
    private final int range; // EG. range without disadvantage
    private final int max_range;
    private WeaponProperties[] properties;

    /**Constructor for melee weapon types */
    private SpecificWeaponType(GeneralWeaponType group, int dmg_dice,int dice_count, DamageType dmg_type,int variant_dmg, WeaponProperties[] properties){
        this.group = group;
        this.dmg_dice = dmg_dice;
        this.dice_count = dice_count;
        this.dmg_type = dmg_type;
        this.variant_dmg = variant_dmg;
        this.range = 0;
        this.max_range = 0;
        this.properties = properties;
    }

    /**Constructor for ranged weapon types AND throwable melee */
    private SpecificWeaponType(GeneralWeaponType group, int dmg_dice,int dice_count, DamageType dmg_type,int variant_dmg, int max_range, int range, WeaponProperties[] properties){
        this.group = group;
        this.dmg_dice = dmg_dice;
        this.dice_count = dice_count;
        this.dmg_type = dmg_type;
        this.variant_dmg = variant_dmg;
        this.max_range = max_range;
        this.range = range;
        this.properties = properties;
    }

    public int get_max_range(){
        return this.max_range;
    }

    public int get_range(){
        return this.range;
    }

    public GeneralWeaponType get_group(){
        return this.group;
    }

    public int get_dmg_dice(){
        return this.dmg_dice;
    }

    public int get_dice_count(){
        return this.dice_count;
    }

    public DamageType get_dmg_type(){
        return this.dmg_type;
    }

    public int get_variant_dmg(){
        return this.variant_dmg;
    }

    public WeaponProperties[] properties(){
        return this.properties;
    }
}