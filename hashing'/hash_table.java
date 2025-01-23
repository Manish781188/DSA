/// find muximum frequency
class hash_table{
public static void main(String args[]){
    int[] arr = {3,1,2,3,2,1,3,3,4,9};
    int  max=0,n=arr.length;
    for(int x: arr){
        max=Math.max(x,max);
    }
    int [] hash = new int[max+1];
    for(int x : arr){
        hash[x]++;
    }
 int ans=-1,freq=-1;
 for(int i=0; i<hash.length;i++){ 
    if(hash[i]>freq){
        freq=hash[i];
        ans=i;
    }
 }
System.out.println(ans + "--->" + freq);
}
}