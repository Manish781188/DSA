class muximum_sum_subArray_with_k_size{

    public static void main(String args[]){

        int[] arr = {3,2,-7,5,-4,6,2,3,-8};
       int k = 3;
       int sum=0;
       for(int i=0;i<k;i++){
         sum+=arr[i];
         
       }
       int ans=sum;
     for(int i=k;i<arr.length;i++){
        sum+=arr[i];
        sum-=arr[i-k];
        // System.out.println(i+"="+sum);
        ans=Math.max(ans,sum);
        // System.out.println(i+"="+ans);
     }
    System.out.println(ans);
    }
}