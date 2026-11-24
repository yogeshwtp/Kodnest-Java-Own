import java.util.Scanner;
import java.util.*;
public class ArrayList2 {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = scan.nextInt();

        System.out.println("Enter the elements: ");
        for(int i=1; i<=n; i++){
            int element = scan.nextInt();
            al.add(element);
        }

        System.out.println("Array List: " + al);
        System.out.println();
        System.out.print("Traverse using FOR loop");
        for(int i=0; i<=al.size()-1; i++){
            System.out.println(al.get(i) + " ");
        }

        System.out.println();
        System.out.print("Traverse using Advanced for loop");
        for(Object x:al){
            System.out.println(x + " ");
        }
    }
}
