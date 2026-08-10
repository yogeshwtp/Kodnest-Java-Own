package T02;
import java.util.Scanner;
public class nestedloop2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println();
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
        }
        scan.close();
    }
}
