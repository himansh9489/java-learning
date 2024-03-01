package src.basic;

public class Operators {
    public static void main(String[] args) {
        // bit manipulation;
        // 4 type of operation;
        // getBit - get whether bit is one or zero on pos;
        int n  = 5; // 0101;
        int pos  = 3;
        int bitmask = n << pos ;
        if((bitmask & n )== 0) //and operator;
            System.out.println("bit is zero");
        else
            System.out.println("bit is one");

        // setBit - set bit to one on pos;
        pos = 1;
        bitmask = 1 << pos;
        int newNumber = n | bitmask;
        System.out.println(newNumber); //7 - 0111

        // clearBit - set bit zero on pos
        pos = 2;
        bitmask =  1 << pos;
        newNumber = n & (~bitmask);
        System.out.println(newNumber); //7 - 0001

        //update bit - use setBit and clearBit operation to perform update;


    }
}
