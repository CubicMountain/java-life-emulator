package ucf;

/**
 * Created by Cubic Mountain on 18.05.17.
 *  Unit Combination Format
 */
public class UcfCoder {


    //public final static int LANDSCAPE_TYPE_MASK        = 0b0000_0000_0000_0000_0000_0000_0000_0111;
    public final static int LANDSCAPE_TYPE_MASK         = 0x0000_0007;
    public final static int LANDSCAPE_TYPE_SHIFT        = 0;

    public final static int LANDSCAPE_TYPE_EMPTY        = 0x0;
    public final static int LANDSCAPE_TYPE_WATER_LOW    = 0x1;
    public final static int LANDSCAPE_TYPE_WATER_HIGH   = 0x2;
    public final static int LANDSCAPE_TYPE_GROUND_LOW   = 0x3;
    public final static int LANDSCAPE_TYPE_GROUND_HIGH  = 0x4;
    public final static int LANDSCAPE_TYPE_GRASS_LOW    = 0x5;
    public final static int LANDSCAPE_TYPE_GRASS_HIGH   = 0x6;

    public final static int HUMAN_TYPE_MASK        = 0b0000_0000_0000_0000_0000_0000_0001_1000;

    public final static int HUMAN_TYPE_EMPTY            = 0x0;
    public final static int HUMAN_TYPE_MAN              = 0x1;
    public final static int HUMAN_TYPE_WOMAN            = 0x2;

    public final static int PLANT_TYPE_EMPTY            = 0x0;
    public final static int PLANT_TYPE_APPLE_TREE            = 0x1;





    /*public static final int LANDSCAPE_MASK = 0xF000;

    public static final int LANDSCAPE_WATER_LOW =  0x1;
    public static final int LANDSCAPE_WATER_HIGH = 0x2;
    public static final int LANDSCAPE_GROUND_LOW =  0x3;
    public static final int LANDSCAPE_GROUND_HIGH =  0x4;
    public static final int LANDSCAPE_DESERT_LOW =  0x5;
    public static final int LANDSCAPE_DESERT_HIGH =  0x6;
    public static final int LANDSCAPE_SNOW_LOW =  0x7;
    public static final int LANDSCAPE_SNOW_HIGH =  0x8;
    public static final int LANDSCAPE_TREE_LOW =  0x9;
    public static final int LANDSCAPE_TREE_HIGH =  0xA;
    public static final int LANDSCAPE_MOUNTAIN_LOW =  0xB;
    public static final int LANDSCAPE_MOUNTAIN_HIGH =  0xC;
    public static final int LANDSCAPE_SWAMP_LOW =  0xD;
    public static final int LANDSCAPE_SWAMP_HIGH =  0xE;
    public static final int LANDSCAPE_CAVE =  0xF;

    public static final int CREATURE_MASK = 0x0F00;

    public static final int CREATURE_HUMAN = 0x1;
    public static final int CREATURE_MAMMOTH = 0x2;
    public static final int CREATURE_WOLF = 0x3;
    public static final int CREATURE_RABBIT = 0x4;
    public static final int CREATURE_SHARK = 0x5;
    public static final int CREATURE_DRAGON = 0x6;
    public static final int CREATURE_UNICORN = 0x7;
    public static final int CREATURE_DOLPHIN = 0x8;
    public static final int CREATURE_SNAKE = 0x9;
    public static final int CREATURE_CHICKEN = 0xA;
    public static final int CREATURE_SCORPION = 0xB;
    public static final int CREATURE_BEAR = 0xC;
    public static final int CREATURE_HORSE = 0xD;
    public static final int CREATURE_RUH = 0xE;
    public static final int CREATURE_KRAKEN = 0xF;*/

    public final static int decodeLandscape(int ucf){
        return decode(ucf, LANDSCAPE_TYPE_MASK, LANDSCAPE_TYPE_SHIFT);
    }

    // uf -> ucf
    public final static int endodeLandscape(int ucf , int uf){
        return encode(ucf, uf, LANDSCAPE_TYPE_MASK, LANDSCAPE_TYPE_SHIFT);
    }
   /* public final static int decodeCreature(int ucf){
        return (ucf & CREATURE_MASK) >> 8;
    }

    public final static int endodeCreature(int ucf , int uf){
        return (ucf & ~CREATURE_MASK)  | (uf << 8);
    }
*/
   private static int encode(int ucf , int uf, int mask, int shift){
       return (ucf & ~mask)  | (uf << shift & mask);
   }
    public final static int decode(int ucf, int mask, int shift){
        return (ucf & mask) >>> shift;
    }
}
