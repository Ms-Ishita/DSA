class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] array = new int[2001];
        for(int i : arr){
        array[i +1000]++;
        }  
        Arrays.sort(array);

        for(int i = 0; i<2000; i++){
            if(array[i]!=0 && array[i]==array[i+1]){
            return false;
            }
        }
        return true;
    }
}