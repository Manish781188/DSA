import java.util.Scanner;
public class ReveseArray_using_Two_pointer{

   public static void reverse(int[] array,int n){
    int i=0;
   int j=n-1;
   while(i<j){
    int temp =array[i];
    array[i]=array[j];
    array[j]=temp;
    i++;
    j--;
   }
    for(int k =0;k<n;k++){
        System.out.print(array[k]+" ");
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
       
   reverse(arr,n);
    }
}