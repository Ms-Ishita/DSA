import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length + nums2.length];
        int index = 0;

        // Copy elements from nums1
        for (int i = 0; i < nums1.length; i++) {
            ans[index++] = nums1[i];
        }

        // Copy elements from nums2
        for (int i = 0; i < nums2.length; i++) {
            ans[index++] = nums2[i];
        }

   
        Arrays.sort(ans);

        int n = ans.length;

        if (n % 2 == 1) {
           
            return ans[n / 2];
        } else {
            
            return (ans[n / 2 - 1] + ans[n / 2]) / 2.0;
        }
    }
}
