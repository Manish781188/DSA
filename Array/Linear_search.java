import java.util.Scanner;
public class Linear_search{
 // ckeck value is found or not
// static boolean searchElement(int[] array , int key ){
//   for(int i=0; i<array.length;i++){
//   if(array[i]==key){
//     return true;
//   }
//   }
//   return false;
// }
/// return index of key value
// static int searchElement(int[] array , int key ){
//   for(int i=0; i<array.length;i++){
//   if(array[i]==key){
//     return i;
//   }
//   }
//   return -1;
// }
///////// print first and last acurence
public static void searchElement(int[] array , int key ){
    // int first =-1;
    int last = -1;
    int first = Integer.MAX_VALUE;
    for(int i = 0;i<array.length;i++){
     if(array[i]==key){
        // last =i;
        // if(first==-1){
        //     first=i;
        // }
        first = Math.min(first,i);
        last = Math.max(last , i);
     }
    }
    // System.out.println(first+" "+last);
    if(first==Integer.MAX_VALUE){
        System.out.println("-1 , -1");
    }
    else{
        System.out.println(first+" "+last);
    }
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
 int n = sc.nextInt();
 System.out.println("Enter the element of array");
 int [] arr = new int[n];
   for(int i=0;i<n;i++){
   arr[i]=sc.nextInt();
   }
System.out.println("Enter your key=");
int key = sc.nextInt();
 searchElement(arr,key);
    }
}