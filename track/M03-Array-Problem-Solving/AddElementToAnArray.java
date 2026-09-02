import java.util.Scanner;

public class AddElementToAnArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40};
        int b[] = new int[arr.length-1];

        int element = 50;
        int index = 2;
        for(int i=0; i<index; i++){
            b[i] = arr[i];
        }
        
        b[index] = element;
        for(int i=index; i<arr.length; i++){
            b[i+1] = arr[i];
        }

        for(int i=0; i<b.length; i++){
            System.out.print(b[i] + " ");
        }
        sc.close();
    }
}
