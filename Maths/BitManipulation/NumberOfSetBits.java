package Maths.BitManipulation;

public class NumberOfSetBits {

    // TC = O(n) n = no. of bits in the data type [ worst case ]
    public int hammingWeight(int n) {
        int count = 0;
        while(n>0){
            if((n&1) == 1) count++;
            n = n>>1;
        }
        return count;
    }

    // More optimal way
    // Brian Kernighan’s algorithm
    // take any positive no. n and observe its binary
    // n     = xxxx1000...000
    // n - 1 = xxxx0111...111

    // TC = O(k) k = no. of set bits 
    public int hammingWeight2(int n) {
        int count = 0;
        while(n!= 0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        
    }
}
