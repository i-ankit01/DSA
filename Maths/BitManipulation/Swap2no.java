package Maths.BitManipulation;

public class Swap2no {
    public static void main(String[] args) {
        // swap two no. without using a third variable 
        int a = 5;
        int b = 9;
        System.out.println("a" + a);
        System.out.println("b" + b);

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a" + a);
        System.out.println("b" + b);
    }
}
