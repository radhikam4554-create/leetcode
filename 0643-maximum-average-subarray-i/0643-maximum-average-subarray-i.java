class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int max=sum;
        for(int r=k;r<nums.length;r++){
            sum=sum+nums[r]-nums[r-k];
            max=Math.max(max,sum);
        }
    return(double) max/k; 
    }
}