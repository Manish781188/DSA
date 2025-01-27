public class QuickSort{

    public static void main(String[] args){
    int arr[] = {3,5,4,2,6,1};
    
        QS(arr , 0 , arr.length-1 );
        for(int i : arr){System.out.print(i + " ");}
    }
    public static void QS(int arr[], int s , int e){
        if(s>=e)return;
        int pivot = partition(arr, s, e);
        QS(arr,s,pivot-1);
        QS(arr,pivot+1,e);
    }
    public static int partition(int[] arr, int s, int e){
        int j = s-1;~
        for(int i=s;i<e;i++){
            if(arr[i]<arr[e]){
                j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        j++;
        int temp = arr[j];
        arr[j] = arr[e];
        arr[e] = temp;
        return j;
    }
}