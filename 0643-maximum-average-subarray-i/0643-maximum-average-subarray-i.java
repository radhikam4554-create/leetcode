class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int max=sum;
        for(int right=k;right<nums.length;right++){
            sum=sum+nums[right]-nums[right-k];
            max=Math.max(max,sum);
        }
    return(double) max/k; 
    }
}