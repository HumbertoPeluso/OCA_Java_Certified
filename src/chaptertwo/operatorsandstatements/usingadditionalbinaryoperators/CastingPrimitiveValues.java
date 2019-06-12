package chaptertwo.operatorsandstatements.usingadditionalbinaryoperators;

public class CastingPrimitiveValues {
   /* We can fi x the examples in the previous section by casting the results to a smaller data
    type. Casting primitives is required any time you are going from a larger numerical data
    type to a smaller numerical data type, or converting from a fl oating-point number to an
    integral value*/
    public static void main(String[] args) {
        int x = (int) 1.0;
        short y = (short) 1921222; // Stored as 20678
        int z = (int)9l;
        long t = 192301398193810323L;

        short x2 = 10;
        short y2 = 3;
        short z2 = (short)(x * y);
    }
}
