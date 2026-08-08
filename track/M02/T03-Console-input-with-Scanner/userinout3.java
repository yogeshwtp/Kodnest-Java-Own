

import java.util.Scanner;

public class userinout3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter char :"); //yogesh
        char ch = scan.next().charAt(2);
        System.out.println(ch);
        

        scan.close();
    }
}
