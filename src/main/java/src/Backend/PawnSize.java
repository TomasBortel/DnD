package src.Backend;

public enum PawnSize{
    TINY(0),
    SMALL(1),
    MEDIUM(2),
    LARGE(3),
    HUGE(4),
    GARGANTUAN(5);

    public final int num_val;

    private PawnSize(int num_val){
        this.num_val = num_val;
    }

    @Override
    public String toString(){
        return this.name().toLowerCase();
    }
}