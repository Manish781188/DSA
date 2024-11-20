class Solution {
    public int kadane(int[] nums){
     int ans=Integer.MIN_VALUE,n=nums.length,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            ans=Math.max(ans,sum);
            if(sum<0) sum=0;
        }
        return ans;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int sum=Arrays.stream(nums).sum();
      int    ans1=kadane(nums);
        for(int i=0;i<nums.length;i++){
            nums[i]*=-1;
        }
        int ans2=kadane(nums);
        if(ans2+sum==0) return ans1;
        return Math.max(ans1,ans2+sum);
       
    }
}