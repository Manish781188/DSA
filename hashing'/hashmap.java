import java.util.*;
public  class hashmap{

public static void main(String args[]){
HashMap<Integer, Integer> m = new HashMap<>();

m.put(7,2);
m.put(9,1);
m.put(-1,3);
m.put(2,4);
m.put(10,5);
m.put(13,-6);
m.put(-7,2);
// System.out.println(m);
// System.out.println(m.size());
// System.out.println(m.get(7));//key
// System.out.println(m.get(10));//null
// System.out.println(m.remove(7));  //key value pair
// System.out.println(m.containsKey(-1));// it is check key is present or not  &it is return true or folse
// System.out.println(m.getOrDefault(5,0)); //  2 is a key and 0 is default value
// System.out.println(m);
//<-------------------------------- Ireation of hashmap---------------------------------------->

   for(Map.Entry<Integer,Integer> x : m.entrySet()){
    System.out.println(x.getKey() +"----> "+ x.getValue());
   }
}

}