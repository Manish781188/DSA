import java.util.*;
class muximum_frequency{
    public static void main(String args[]){
        int arr[] = {3,1,2,5,6,1,2,3,1,1,5,6,12};
   HashMap<Integer,Integer> m = new HashMap<>();

   for(int i : arr){
    m.put(i,m.getOrDefault(i,0)+1);
   }
   int val = 0, key=-1;

   for(Map.Entry<Integer,Integer> x : m.entrySet()){
    if(x.getValue() >val){
        val=x.getValue();
        key = x.getKey();
    }
   }
  System.out.println(key +" -----> "+ val);
    }
}