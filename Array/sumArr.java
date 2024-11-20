import java.util.Scanner;
public class sumArr{
    public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of arr");
   int size = sc.nextInt();
   int sum = 0;
   int arr[] = new int[size];
   for(int i=0; i<size;i++){
    arr[i]=sc.nextInt();
   }
 for(int ele :arr){
    sum+=ele;
 }
     System.out.println("total = "+sum);

     int max = arr[0];
     for(int i=1; i<size;i++){
        // if(arr[i]>max){
        //     max = arr[i];
        // }
        max = Math.max(max ,arr[i]);
     }
     System.out.println( "max = "+max);
    }
}