class Insertion_sort{

    public static void main(String args[]){

        int[] arr ={7,1,2,6,5,4};
        for(int i=1;i<arr.length;i++){
            int x = arr[i];  // consider first element as a sorted
            int j=i-1;
            for( ;j>=0 && arr[j]>=x ; j--){
                arr[j+1] =arr[j];
            }
            arr[j+1] =x;
             for(int ele : arr){
            System.out.print(ele +" ");
        }
        
        System.out.println();
        }
       
    }
}