package Stacks;

public class NumberOfGreaterElements {

    public static int[] count_NGE(int arr[], int indices[]) {

        int[] ans = new int[indices.length];
        // code here
        for(int i = 0; i<indices.length; i++){
            int element = arr[indices[i]];
            int count = 0; 
            for(int j = indices[i]+1; j<arr.length; j++){
                if(arr[j] > element) count++;
            }
            ans[i] = count;
        }
        return ans;
        
    }

    public static void main(String[] args) {
        
    }
}
