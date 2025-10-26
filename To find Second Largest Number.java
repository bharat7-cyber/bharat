class Solution {
    public int getSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (arr == null || arr.length < 2) {
            return -1;
        }
        
        for(int num : arr){
            if(num > largest){
                secondLargest = largest;
                largest = num;
            }
            else if (num < largest && num > secondLargest ){
                secondLargest = num;
            }
        }
        
        if(secondLargest == Integer.MIN_VALUE){
            return -1;
        }
        return secondLargest;
    }
    
    public static void main(String[] args){
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int[] arr2 = {10, 5, 10};
        int[] arr3 = {10, 10, 10};
        
        Solution solution = new Solution();
        
        System.out.println(solution.getSecondLargest(arr1));
        System.out.println(solution.getSecondLargest(arr2));
        System.out.println(solution.getSecondLargest(arr3));
    }
}
