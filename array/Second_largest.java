package array;

class Second_largest {

    // Function to find the second largest element
    static int secondLargest(int[] a, int n) {
        int largest = a[0];
        int slargest = -1; // Initialize second largest as -1
        
        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
                slargest = largest;  // Update second largest to previous largest
                largest = a[i];       // Update largest
            } else if (a[i] < largest && a[i] > slargest) {
                slargest = a[i];      // Update second largest
            }
        }
        return slargest;
    }

    // Function to find the second smallest element
    static int secondSmallest(int[] a, int n) {
        int smallest = a[0];
        int ssmallest = Integer.MAX_VALUE; // Initialize second smallest to maximum value
        
        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
                ssmallest = smallest;   // Update second smallest to previous smallest
                smallest = a[i];        // Update smallest
            } else if (a[i] != smallest && a[i] < ssmallest) {
                ssmallest = a[i];       // Update second smallest
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 5, 2};
        int n = arr.length;

        System.out.println("Second Largest: " + secondLargest(arr, n));
        System.out.println("Second Smallest: " + secondSmallest(arr, n));
    }
}
