import java.util.*;

public class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int mod = ((num % value) + value) % value;
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        int ans = 0, reqVal = 0;
        while (true) {
            if (map.getOrDefault(reqVal, 0) > 0) {
                map.put(reqVal, map.get(reqVal) - 1);
                ans++;
            } else {
                break;
            }
            reqVal = (reqVal + 1) % value;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, -10, 7, 13, 6, 8};
        int value = 5;
        System.out.println(s.findSmallestInteger(nums, value));
    }
}
