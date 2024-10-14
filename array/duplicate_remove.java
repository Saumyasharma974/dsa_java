package array;

public class duplicate_remove {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3};  // Input sorted array

        int i = 0;  // Track index for unique elements
        for (int j = 1; j < arr.length; j++) {  // Traverse the array starting from second element
            if (arr[i] != arr[j]) {  // Check if current element is unique
                arr[i + 1] = arr[j];  // Place unique element in the next position
                i++;  // Increment unique element index
            }
        }
        System.out.println(i + 1);  // Print the count of unique elements
    }
}
