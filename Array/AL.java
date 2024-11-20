import java.util.*;
public class AL{

    public static void main(String[] args){
      ArrayList<Integer> list = new ArrayList<>();  /// array list create syntax & array list is dynamic
    // //  List<String> list =new ArrayList<>();  /// array list create syntax
    // list.add("parvez");
    // list.add("sneha");
    // list.add("divyanshu");
    // list.add(2,"ankit");  // index , value
    // // list.remove(2);//index
    // // System.out.println( list.remove(2)); // it is display the removed value

    //   System.out.println(list.get(1));
    // System.out.println(list);
    // System.out.println(list.size());


    //<----------------------------------Generic array list-------------------------------------->
//    ArrayList list = new ArrayList();  /// array list create syntax & array list is dynamic
 
//     list.add("parvez");
//     list.add(1.5);
//     list.add(45587552652348l);
//     list.add(2,"ankit");  // index , value


//       System.out.println(list.get(1));
//     System.out.println(list);
//     System.out.println(list.size());


//<-----------------------------------------get value from user-------------------------------------------->
Scanner sc = new Scanner(System.in);`
   System.out.println("Enter the value of n");
   int n = sc.nextInt();
   for(int i =0; i<n;i++){
    // int x = sc.nextInt();
    list.add(sc.nextInt());
   } 
    for(int i =0; i<n;i++){
   System.out.println(list.get(i));
   } 
//    System.out.println(list);
    }
}