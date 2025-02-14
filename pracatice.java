public class pracatice{

    public static void main(String args[]){
        int[] arr ={4,2,3,6};
        int n = arr.length;
        
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=i;j<n;j++){   
               sum+=arr[j];
               System.out.println(sum);
            }
                System.out.println();
        }
    }
}