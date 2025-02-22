class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1] && (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != nums[i])) {
                duplicates.add(nums[i]);
            }
        }
        return duplicates;
    }
}