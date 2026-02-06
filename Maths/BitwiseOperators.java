package Maths;

public class BitwiseOperators {

    public static boolean isOdd(int n){
        return (n&1)==1;
    }

    public static int returnUniqueElement(int[] arr){
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }

    public static boolean findIthBit(int n , int i){
        // returning true if the bit is set i.e. 1

        // return (n&(1<<(i-1))) == 1; never compare to 1 as it will not return the single bit

        return (n&(1<<(i-1))) != 0;
    }

    public static int setIthBit(int n , int i ){
        // return the no. by setting the i'th bit
        return n | (1<<(i-1));
    }

    public static int findNthMagicNumber(int n ){
        int base = 5;
        int ans = 0;
        while(n > 0){
            int last = n&1;
            n = n>>1;
            ans += last*base;
            base *= 5;
        }
        return ans;
    }

    public static void main(String[] args) {
        // System.out.println(isOdd(121));

        // int[] arr = {2,2,4,3,5,4,6,5,6};
        // System.out.println(returnUniqueElement(arr));

        // System.out.println(findIthBit(18, 4));

        // System.out.println(setIthBit(18, 4));

        System.out.println(findNthMagicNumber(5));
    }
}
