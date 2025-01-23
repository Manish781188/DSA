public class linked_list{
    static Node head ;
    static class Node{
        int val ;
        Node next;
        Node(int d){
            val=d;
            next=null;

        }
    }
    public static void insetTail(int d ){
        Node n = new Node(d);
        if(head==null){
            head = n;
            return;
        }
        Node tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next = n;
    }
    public static void insertHead(int d){
        Node n = new Node(d);
        if(head == null){
            head = n;
            return;
        }
        n.next = head;
        head = n;
    }
    public static void removeHead(){
        if(head==null){
            System.out.println("khali hai");
            return;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
    }
    public static void removeTail(){
        if(head==null){
            System.out.println("khali hai");
            return;
        }
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public static void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        linked_list list = new linked_list();
        insertHead(1);
        insetTail(2);
        insertHead(3);
        insetTail(4);
        print();
      removeTail();
        print();
    }
}