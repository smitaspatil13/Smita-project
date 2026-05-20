package JavaAssignments2;

public class ReverseArrayInPlace
{
    public static void main(String[] args) {
        // Given array
        int[] arr = {10, 25, 38, 47, 56, 62, 71};

        // 1. Print the original array
        System.out.print("Before: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line

        // 2. Reverse the array in-place
        // The loop only runs up to the middle (arr.length / 2)
        for (int i = 0; i < arr.length / 2; i++) {
            // Find the corresponding index from the back end
            int j = arr.length - 1 - i;

            // Swap elements using a temporary variable
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // 3. Print the reversed array
        System.out.print("After: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

