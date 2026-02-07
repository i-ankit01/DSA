package Arrays;

// Leetcode question no. = 169

public class MajorityElement1 {

    public static int majorityElement(int[] a) {
        int n = a.length;
        int cnt = 1;
        int majority = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] == majority)
                cnt++;
            else {
                cnt--;
                if (cnt == 0) {
                    majority = a[i];
                    cnt++;
                };
            }
        }
        return majority;
    }

    public static void main(String[] args) {

    }
}
