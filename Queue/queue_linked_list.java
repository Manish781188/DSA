import java.util.*;
public class queue_linked_list{

    public static void main(String[] args){
     Queue<Integer> q = new LinkedList<Integer>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     System.out.println(q.peek());
     System.out.println(q);
     while(!q.isEmpty()){
        System.out.println(q.remove());
     }
    }
    
}