class muximum_product_subarray_with_k_size{

    public static void main(String args[]){

        int[] arr = {8,4,6,4,0,3,5,7,0,4,7,4,0};
       int k = 3;
       int product=1;
       for(int i=0;i<k;i++){
         product*=arr[i];
         
       }
       if(product==0)product=1;
       int ans=product;
     for(int i=k;i<arr.length;i++){
        if( arr[i]==0 ){
             arr[i]=1;;
            product*=arr[i];
            product/=arr[i-k];
        }
     
          ans=Math.max(ans,product);
        
     }
    System.out.println(ans);
    }
}