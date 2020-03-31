package DnD.Backend;

import java.util.Arrays;
import java.util.Random;

public class Dice{

    public static int roll(int dice_type){
        Random r = new Random();
        return r.nextInt(dice_type) + 1;
    }

    public static int rolls_sum(int dice_type, int roll_count){
        int sum = 0;
        for(int i = 0; i < roll_count; i++){
            sum += roll(dice_type);
        }
        return sum;
    }

    public static int[] rolls_array(int dice_type, int roll_count){
        int[] rolls = new int[roll_count];
        for(int i = 0; i < roll_count; i++){
            rolls[i] = roll(dice_type);
        }
        return rolls;
    }


/*     public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println(Arrays.toString(rolls_array(6,3)));
        }
    } */

}