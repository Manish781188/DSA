public class heapSort {

    public static void main(String[] args) {
        
        int [] arr = {4,5,7,6,1,2,3};

        HS(arr,arr.length);

        for(int x : arr) {
            System.out.print(x +" ");
        }
    }

    public static void HS(int [] arr, int n) {

        for(int i = n/2 - 1; i>=0; i--) {
             heapify(arr,n,i);
        }

        for(int i = n-1; i>0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);
        }
    }

    public static void heapify(int arr [], int n, int i) {
        int max = i , l = 2*i+1 , r = 2*i+2;

        if(l<n && arr[l] > arr[max]) {
            max = l;
        }

        if( r < n && arr[r] > arr[max]) {
            max = r;
        }

        if(max != i) {
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            heapify(arr, n, max);
        }
    }
    
}