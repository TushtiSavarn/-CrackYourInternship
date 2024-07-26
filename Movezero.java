class Solution 
{ 
    // Function which pushes all zeros to the end of an array.
    public void moveZeroes(int[] arr) 
    { 
        int count = 0;  // Count of non-zero elements
        // Traverse the array. If the element is not zero, then
        // replace the element at index 'count' with this element
        for (int i = 0; i < arr.length; i++) 
            if (arr[i] != 0) 
                arr[count++] = arr[i]; // Assign non-zero element
        
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of the first 0.
        // Make all elements 0 from count to end.
        while (count < arr.length) 
            arr[count++] = 0; 
    } 
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 7, 0, 6, 0, 9};
        Solution solution = new Solution();
        solution.moveZeroes(arr);
        System.out.println("Array after pushing zeros to the back:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
