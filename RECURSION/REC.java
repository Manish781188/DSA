public class REC{
    public static void main(String[] args){
        show(5);
    }
    public static void show(int n){
        if(n==0) return;
        System.out.println(n);
        show(n-1);
        // show(n-2); //infinite
        System.out.println(n);
    }
}