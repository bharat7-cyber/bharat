import java.util.ArrayList;
import java.util.List;

class Solution {

    public ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        long currentSum = 0; 

        for (int right = 0; right < n; right++) {
            
            currentSum += arr[right];

            while (currentSum > target && left <= right) {
                currentSum -= arr[left];
                left++;
            }

            if (currentSum == target) {
                ArrayList<Integer> result = new ArrayList<>();
                result.add(left + 1);
                result.add(right + 1);
                return result;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        Solution ob = new Solution(); 
        
        int[] arr1 = {1, 2, 3, 7, 5};
        int target1 = 12;
        System.out.println("Input: [1, 2, 3, 7, 5], Target: 12");
        System.out.println("Output: " + ob.subarraySum(arr1, target1));

        System.out.println("---");

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target2 = 15;
        System.out.println("Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], Target: 15");
        System.out.println("Output: " + ob.subarraySum(arr2, target2));

        System.out.println("---");

        int[] arr3 = {5, 3, 4};
        int target3 = 2;
        System.out.println("Input: [5, 3, 4], Target: 2");
        System.out.println("Output: " + ob.subarraySum(arr3, target3));
        
        System.out.println("---");
        
        int[] arr4 = {1, 0, 2, 3};
        int target4 = 0;
        System.out.println("Input: [1, 0, 2, 3], Target: 0");
        System.out.println("Output: " + ob.subarraySum(arr4, target4));
    }
}
