class Solution {
    static int maxArea(int nums[]) {
        if (nums == null || nums.length < 2) {
            return 0; // Not enough lines to form a container
        }
        
        int i = 0, j = nums.length - 1;
        int mx = 0; // Initialize max area to 0
        
        while (i < j) {
            int water = (j - i) * Math.min(nums[i], nums[j]);
            mx = Math.max(mx, water);
            
            // Move the pointer pointing to the shorter line
            if (nums[i] < nums[j]) {
                i++;
            } else {
                j--;
            }
        }
        
        return mx;
    }
}
