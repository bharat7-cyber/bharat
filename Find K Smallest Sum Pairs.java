import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int m = arr1.length;
        int n = arr2.length;
        
        if (k == 0 || m == 0 || n == 0) {
            return result;
        }
        
        
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        
       
        int max_i = Math.min(m, k);
        
        
        for (int j = 0; j < n; j++) {
            minHeap.offer(new int[]{arr1[0] + arr2[j], 0, j}); 
        }
        
        int count = k;
        
        
        while (count > 0 && !minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int i = current[1];
            int j = current[2];
            
            result.add(new ArrayList<>(Arrays.asList(arr1[i], arr2[j])));
            count--;
            
            if (i + 1 < m) {
                
                minHeap.offer(new int[]{arr1[i + 1] + arr2[j], i + 1, j});
            }
            
        }
        
        return result;
    }
}
