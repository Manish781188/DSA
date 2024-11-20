import java.util.Scanner;
public class revese_array_in_group{

public static void reversegroup(int[] arr,int i,int j){
   while(i<j){
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
i++;
j--;
   }
    
}
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
     int n = sc.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter the elemnts of array");
     for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
     }
    System.out.println("Enter the value of K");
     int k = sc.nextInt();
     int i =0;
     for(int j=k-1; j<n; j+=3){

reversegroup(arr,i,j);
i+=k;
     }
     for(int ele : arr){
        System.out.println(ele);
     }
}
}