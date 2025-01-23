public class decimalTobinary{
    public static void main(String[] args){
        show(26);
    }
    public static void show(int n){
        if(n==0) return;
       
        show(n/2);
        // show(n-2); //infinite
        System.out.print(n%2 +" ");
    }
}