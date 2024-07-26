import java.io.*;

class Solution {

    // Function to find the Majority element in an array
    public int majorityElement(int arr[]) {
        int n = arr.length;
        int candidate = findCandidate(arr, n);
        if (isMajority(arr, n, candidate))
            return candidate;
        else
            return -1; // No majority element
    }

    // Function to find the candidate for Majority element
    private int findCandidate(int arr[], int n) {
        int count = 1, candidate = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate)
                count++;
            else
                count--;

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }
        return candidate;
    }

    // Function to check if the candidate is Majority
    private boolean isMajority(int arr[], int n, int candidate) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == candidate)
                count++;
        }
        return count > n / 2;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        Solution sol = new Solution();
        // Function calling
        int result = sol.majorityElement(arr);
        
        if (result != -1)
            System.out.println("Majority Element: " + result);
        else
            System.out.println("No Majority Element");
    }
}
