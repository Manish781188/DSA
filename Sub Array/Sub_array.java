public class Sub_array{

    public static void main(String args[]){
        int[] arr = {25,5,20,4,18};
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
                System.out.println();
        }
    }
}