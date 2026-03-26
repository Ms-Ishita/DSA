class Solution {
    public int searchFirst(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                end = mid-1;

            }
            else if(arr[mid]<target){
                start = mid+1;
                
            }
            else end = mid-1;
        }
        return ans;

    }
    public int searchLast(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start+(end - start)/2;
            if(arr[mid] == target){
                ans = mid;
                start= mid+1;
            }
            else if(arr[mid]<=target){
                start= mid+1;
            }
            else end = mid-1;


        }
        return ans ;
    }
    public int[] searchRange(int[] nums, int target) {
        int result = searchFirst(nums, target);
        int result1 = searchLast(nums, target);
        return new int[] {result, result1};
        
        
    }
}