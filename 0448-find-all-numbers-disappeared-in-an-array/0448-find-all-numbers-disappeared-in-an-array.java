class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> x=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
        if(!set.contains(i)){
            x.add(i);
        }
        }    
    return x;    
    }
}