import java.util.Arrays;
/*

Arrays.toString() is a static method provided by the java.util.Arrays class in Java. It's used to convert an array
into a human-readable string representation. This method is overloaded for different types of arrays, including
arrays of primitive types (such as int[], double[], etc.) and arrays of objects (such as String[], Object[], etc.).


 */
public class MergeSortedArray {
    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        int[] mergedArray = new int[m + n]; // Initialize the merged array with proper size

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                mergedArray[k--] = nums1[i--];
            } else {
                mergedArray[k--] = nums2[j--];
            }
        }

        // If elements from nums2 are still remaining
        while (j >= 0) {
            mergedArray[k--] = nums2[j--];
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 2, 1, 1};
        int m = 6;
        int[] nums2 = {2, 3, 10};
        int n = 3;

        int[] mergedArray = merge(nums1, m, nums2, n);

        // Print the merged array
        System.out.println(Arrays.toString(mergedArray));
    }
}
