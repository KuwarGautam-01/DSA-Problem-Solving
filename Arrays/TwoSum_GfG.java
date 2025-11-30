class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        
        int n = arr.length;
        Arrays.sort(arr);
        
        //2 pointer 
        int left = 0;
        int right = n-1;
        
        while(left < right) {
            int sum = arr[left] + arr[right];
            
            if (sum == target) {
                return true;
            }else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return false;
    }
}