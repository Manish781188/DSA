public class marge_sort{
    public static void main(String[] args){
        int arr[] = {3,2,4,1,6,5,7,10,78,54};
        MS(arr , 0 , arr.length-1);
        for(int i : arr){
            System.out.print(i + " ");
        };
    }

    public static void MS(int arr[] ,int s, int e){
        if(s==e)return;
        int mid = s+(e-s)/2;
        MS(arr ,s,mid);
        MS(arr , mid+1,e);
        marge(arr ,s,mid ,e);
    }
    public static void marge(int arr[] ,int s, int mid ,int e){
     int l = mid-s+1 , r = e-mid;  //j-i+1
     int left[] = new int[l];
     int right[] = new int[r];
     for(int i=0;i<l;i++){left[i] =arr[i+s];}
     for(int i=0;i<r;i++){right[i] =arr[i+mid+1];}

     int i=0 ,j=0,k=s;
     while(i<l && j<r){
        if(left[i]<right[j]){arr[k++]=left[i++];}
        else{arr[k++]=right[j++];}
     }
     while(i<l){
        arr[k++]=left[i++];
     }
     while(j<r){
        arr[k++]=right[j++];
        
     }
    }
}