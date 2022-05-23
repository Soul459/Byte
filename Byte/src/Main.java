public class Main {
    public static void main(String[] args) {

        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;
        System.out.println("IntMin = " + myMinValue);
        System.out.println("IntMax = " + myMaxValue);
        System.out.println("Busted Max = "+(myMaxValue+1));
        //int MMax = 2147483648;


        byte myMinByte = Byte.MIN_VALUE;
        byte myMaxByte = Byte.MAX_VALUE;
        System.out.println("ByteMax = "+myMinByte);
        System.out.println("ByteMin = "+myMaxByte);


        short myMinShort = Short.MIN_VALUE;
        short myMaxShort = Short.MAX_VALUE;
        System.out.println("ShortMax = "+myMinShort);
        System.out.println("ShortMin = "+myMaxShort);

        long myMinLong = Long.MIN_VALUE;
        long myMaxLong = Long.MAX_VALUE;
        System.out.println("LongMax = "+myMinLong);
        System.out.println("LongMin = "+myMaxLong);

        long MaxIntPlus1 = 2147483648L;
        System.out.println(MaxIntPlus1);




        byte myNewByte = (byte)(myMinByte / 2);



        int Int = 1;
        byte Byte = 2;
        short Short = 3;
        long Long = 50000+10*(Int + Byte + Short);
        System.out.println(Long);

    }
}