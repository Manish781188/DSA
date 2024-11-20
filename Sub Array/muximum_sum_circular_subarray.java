import java.util.*;
class muximum_sum_circular_subarray{
    public static int kadanes(int[] arr){
        int ans = Integer.MIN_VALUE,sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            ans = Math.max(ans,sum);
            if(sum<0)sum=0;
            
        }
        return ans;
    }
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
     System.out.println("Enter the elements  of array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
   int sum = Arrays.stream(arr).sum();
  int  ans1=kadanes(arr);
///sing flip 
for(int i=0;i<arr.length;i++){
    arr[i]*=-1;

}
 int ans2=kadanes(arr);
   if(ans2+sum==0){
    System.out.println("muximum sum  circular sub arrays if :=" +ans1);
    }else{
    System.out.println("muximum sum  circular sub arrays :=" +Math.max(ans1,ans2+sum));
    }
}
}