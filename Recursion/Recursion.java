package Recursion;
public class Recursion{

    public static void printSubsets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        printSubsets(p + up.charAt(0), up.substring(1));
        printSubsets(p, up.substring(1));
    }

    
    public static void main(String[] args) {
        printSubsets("","abc");
    }
}