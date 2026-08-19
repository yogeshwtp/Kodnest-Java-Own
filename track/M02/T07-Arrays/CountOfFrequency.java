class Freq{
    int count = 0;
    void count(int arr[], int key){
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i] == key){
                count++;
            }
        }
        System.out.println(key + " occurs " + count + " times");
    }
}

public class CountOfFrequency {
    public static void main(String[] args){
        int arr[] = {10, 50, 10, 80, 60, 60, 70};
        Freq fs = new Freq();
        fs.count(arr,30); 
    }
}
