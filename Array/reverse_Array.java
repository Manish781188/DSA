import java.util.Scanner;
public class reverse_Array{

    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter the elemnts of array");
     for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     //reverse array
    for(int i=0;i<n/2;i++){
        int temp = arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
    }
    // print array
    for(int i =0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    }
}