import java.util.ArrayList;
import java.util.List;

class Solution {

    public int missingNum(int[] arr) {
        int n = arr.length + 1;
        
        long totalSum = (long)n * (n + 1) / 2;
        
        long arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        
        return (int)(totalSum - arraySum);
    }

    public static void main(String[] args) {
        Solution solver = new Solution();

        int[] arr1 = {1, 2, 3, 5};
        System.out.println(solver.missingNum(arr1));

        int[] arr2 = {8, 2, 4, 5, 3, 7, 1};
        System.out.println(solver.missingNum(arr2));

        int[] arr3 = {1};
        System.out.println(solver.missingNum(arr3));
        
        int[] arr4 = {};
        System.out.println(solver.missingNum(arr4));
    }
}
