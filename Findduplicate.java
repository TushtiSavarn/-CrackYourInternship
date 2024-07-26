class Solution {
    public int findDuplicate(int[] nums) {
        // Sort the array 
       Arrays.sort(nums);

        // Checking adjacent elements for duplicates
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1; // This line will never be reached if there's always a duplicate.
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2}; // Initialize the array properly
        Solution sol = new Solution();
        int duplicate = sol.findDuplicate(arr);
        System.out.println("Duplicate number is: " + duplicate);
    }
}
