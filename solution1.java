class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int p=0;
        for (int i=0;i<n;i++){
            if (nums[i]> nums[(i+1)%n]){
                p++;
            }
        }
        return p<=1;
    }
}
