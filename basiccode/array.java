public class array {
    public static void main(int[] args) {
        int[] arr = {3, 5, 7, 2, 8, 1};
        int maxElement = arr[0];  // Initialize with the first element

        // Iterate through the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];  // Update maxElement if a larger element is found
            }
        }

        System.out.println("The largest element is: " + maxElement);
    }
}
