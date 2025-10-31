import java.util.*;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int index = 0;

        for (int num : nums) {
            if (seen.contains(num)) {
                result[index++] = num;
                if (index == 2) break;
            } else {
                seen.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();  

        int[] nums1 = {0, 1, 1, 0};
        int[] nums2 = {0, 3, 2, 1, 3, 2};
        int[] nums3 = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};

        System.out.println(Arrays.toString(obj.getSneakyNumbers(nums1)));
        System.out.println(Arrays.toString(obj.getSneakyNumbers(nums2)));
        System.out.println(Arrays.toString(obj.getSneakyNumbers(nums3)));
    }
}
