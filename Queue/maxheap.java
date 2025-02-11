import java.util.*;
public class maxheap{

    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.add(4);
        pq.add(7);
        pq.add(6);
        pq.add(2);
        pq.add(0);
        pq.add(5);
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+" ");
        }
    }
}