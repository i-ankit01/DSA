package Maths.BitManipulation;

public class ClearIthBit {

    public static int clearIthBit(int n, int i){
        return n&(~(1<<(i-1)));
    }

    public static int toggleIthBit(int n , int i){
        return n^(1<<(i-1));
    }
    public static void main(String[] args) {
        System.out.println(clearIthBit(13, 3));
        System.out.println(clearIthBit(13, 3));
    }
}
