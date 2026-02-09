package Maths.BitManipulation;

public class PowerOf2 {

    // check if the no. is the power of two 
    public static boolean checkPowerOf2(int n){
        return n>0 && (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOf2(16));
    }
}
