public class BinarySearch {
    public static int binSearch(int arr[], int k) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (k > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60 };
        int k = 50;
        System.err.println(binSearch(arr, k));
    }
}
