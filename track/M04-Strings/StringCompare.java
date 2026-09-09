public class StringCompare{
    public static void main(String[] args) {
     String s1 = "Java";
     String s2 = "JaVa";
     if(s1== s2){
        System.out.println("Reference are same");
     }else{
        System.out.println("Reference are different");
     }

     if(s1.equalsIgnoreCase(s2)){
        System.out.println("Strings are same");  
     }else{
        System.out.println("Strings are different");
     }
    }
}
