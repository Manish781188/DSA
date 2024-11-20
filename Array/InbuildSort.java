import java.util.Arrays;
class InbuildSort{

    public static void main(String[] args){
        int[] arr ={43,43,23,89,4};
        Arrays.sort(arr);
        // Integer[] arr ={43,43,23,89,4};
        // Arrays.sort(arr, collections.reverseOrder());
        for(int i :arr){
            System.out.println(i);
        }
    }
}