package Maths.BitManipulation;

public class BinaryNumberWithAlternateBits {

    public boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        while(n != 0){
            if((n&1) != 0){
                n = n >> 1;
            }
            else return false;
        }
        return true;
    }

    // Slightly more optimal for checking
    // if n is in the form of 1111...11 then n & (n+1) == 0 because n+1 will be 10000..00 
    public boolean hasAlternatingBits2(int n) {
        n = n ^ (n>>1);
        return (n & (n+1)) == 0;
    }

    public static void main(String[] args) {
        
    }
}
