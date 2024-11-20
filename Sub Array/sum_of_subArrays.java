//  public class sum_of_subArrays{
//     public static void main(String args[]){
//         int[] arr = {2,5,1,4,3};
//         int n = arr.length;
//         for(int i=0;i<n;i++){
//             for(int j=i;j<n;j++){
//                   int sum=0;
//                 for(int k=i;k<=j;k++){
//                   sum=sum+arr[k];
                   
//                 }
//                 System.out.println(sum);
//             }
//                System.out.println();
//         }
//     }
//  }
 //////////////////////////....Optimize
 public class sum_of_subArrays{
    public static void main(String args[]){
        int[] arr = {2,5,1,4,3};
        int n = arr.length;
        for(int i=0;i<n;i++){
             int sum=0;
            for(int j=i;j<n;j++){
                 sum+=arr[j];
                System.out.println(sum);
            }
               System.out.println();
        }
    }
 }