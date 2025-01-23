class reverse_string{

    public static void main(String args[]){
     String s = "coder";
    //  StringBuilder sb = new StringBuilder(s);
    //  sb.reverse();
    //  System.out.println(sb);

//<----------------------------------------- check string is palindrom or not
      String s1 = "rotor";
      StringBuilder rev = new StringBuilder(s1);
      rev.reverse();
     // System.out.println(s==rev.toString());  // == is check address
     System.out.println(s1.equals(rev.toString()));  // .equuals is check value
    }
}