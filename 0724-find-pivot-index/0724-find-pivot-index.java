class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int leftSum = 0;
    
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
       int rightSum = sum;
        for(int i = 0; i < nums.length; i++){
            rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum){
             return i;
            }
            leftSum = leftSum + nums[i]; 
        }
        return -1;
    }
}