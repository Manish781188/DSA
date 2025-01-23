import java.util.*;
public class queue_AL{
    static class queue{
        ArrayList<Integer> li = new ArrayList<>();
        public void enqueue(int x){
            li.add(x);
        }
        public int dequeue(){
            if(li.size() == 0)return -1;
            return li.remove(0);
        }
        public int peek(){
            if(li.size() == 0)return -1;
            return li.get(0);
        }
        public boolean isEmpty(){
            return li.size() == 0;
        }
        
    }

    public static void main(String[] args){
        queue q = new queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println(q.peek());
        System.out.println(q.dequeue());
        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
    }
}