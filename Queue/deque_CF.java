import java.util.*;
public class deque_CF{

    public static void main(String[] args){
        Deque<Integer> q = new ArrayDeque<Integer>();
        q.add(1);
        q.addFirst(2);
        q.addLast(3);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.peekFirst());
        System.out.println(q.peekLast());
        while(!q.isEmpty()){
            System.out.println(q.removeLast());
        }
        System.out.println(q.poll());
    }
}