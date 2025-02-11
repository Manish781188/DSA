class pracatice{
  
    public static void main(String args[]){
       int [] nums = {0,0,1,1,2,3,4,5,6,7,8,9,3,6,8};
        int j=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j]=nums[i];
                j++;
            }
        }
       System.out.println(j);
        // return j;

        
        }
}