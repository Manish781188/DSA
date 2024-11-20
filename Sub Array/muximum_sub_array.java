import java.util.Scanner;
class muximum_sub_array {
    public static void main(String args[]) {
       
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int[] arr = new int[size];
     System.out.println("Enter the elements  of array");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
          int sum=0;
           int ans = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
            sum+=arr[i];
              ans=Math.max(ans,sum);
            if(sum<0)sum=0;
        }
        System.out.println("muximus sum is : "+ ans);
      
    }
}