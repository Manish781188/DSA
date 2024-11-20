import java.util.Scanner;
public class IF_Else{
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
 /// a>=2b or b>=2a
 int a = sc.nextInt();
 int b = sc.nextInt();
   if(a>=2*b || b>=2*a){
    System.out.println(0);
   }else{
    int min=Math.min(a,b);
    int max =Math.max(a,b);
    System.out.println(Math.min(2*min-max,min-max/2));
   }
    }
 }