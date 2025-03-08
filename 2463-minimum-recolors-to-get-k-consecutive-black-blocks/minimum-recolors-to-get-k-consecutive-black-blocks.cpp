class Solution {
public:
    int minimumRecolors(string blocks, int k) {
       {
        int n = blocks.size();
        int minOperations = INT_MAX; // Initialize to maximum possible value
        int currentWhiteCount = 0;

        // Count white blocks in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks[i] == 'W') {
                currentWhiteCount++;
            }
        }

        // Initialize the minimum operations with the count of white blocks in the first window
        minOperations = currentWhiteCount;

        // Slide the window across the string
        for (int i = k; i < n; i++) {
            // Add the new block to the window
            if (blocks[i] == 'W') {
                currentWhiteCount++;
            }
            // Remove the block that's sliding out of the window
            if (blocks[i - k] == 'W') {
                currentWhiteCount--;
            }
            // Update the minimum operations
            minOperations = min(minOperations,currentWhiteCount);
        }

        return  minOperations;
    }
    }
};