import java.util.Scanner;
public class ExceptionHandling1 {
    public static void main(String[] args){
        System.out.println("Connection established");
        try{
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a : ");
            int a = scan.nextInt();
            System.out.println("Enter b : ");
            int b = scan.nextInt();

            int res = a/b;
            System.out.println("Result : " + res);
            scan.close();
        }
        catch(Exception e){
            System.out.println("Exception handled");
            //System.out.println(e.getMessage());
        }
        System.out.println("Connection terminated");
        
    }
    
}
