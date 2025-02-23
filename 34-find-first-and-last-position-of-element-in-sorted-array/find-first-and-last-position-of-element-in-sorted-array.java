class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);
        return result;
    }

    private int findStartingIndex(int[] nums, int target) {
        int s = 0, e = nums.length - 1, ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                ans = mid;
                e = mid - 1; // Move left to find the first occurrence
            } else if (nums[mid] < target) {
                s = mid + 1; // Move right
            } else {
                e = mid - 1; // Move left
            }
        }
        return ans;
    }

    private int findEndingIndex(int[] nums, int target) {
        int s = 0, e = nums.length - 1, ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == target) {
                ans = mid;
                s = mid + 1; // Move right to find the last occurrence
            } else if (nums[mid] < target) {
                s = mid + 1; // Move right
            } else {
                e = mid - 1; // Move left
            }
        }
        return ans;
    }
}

