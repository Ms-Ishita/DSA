class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
       int n = nums.length;
        int[] diff = new int[n + 1]; // Difference array

        // Process queries using the difference array
        for (int[] q : queries) {
            int li = q[0], ri = q[1];
            diff[li] -= 1;
            diff[ri + 1] += 1;
        }

        // Apply the difference array to get final decrements
        int decrement = 0;
        for (int i = 0; i < n; i++) {
            decrement += diff[i];
            nums[i] += decrement; // Apply the decrement effect

            // If any value is still > 0, return false
            if (nums[i] > 0) {
                return false;
            }  
    }
    return true; 
}
}