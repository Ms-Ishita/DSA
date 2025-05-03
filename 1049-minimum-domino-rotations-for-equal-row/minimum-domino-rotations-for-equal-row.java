class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int major = tops[0];
        int rotation = check(major, tops, bottoms);

        if(rotation== Integer.MAX_VALUE){
            major = bottoms[0];
            rotation=check(major, tops, bottoms);
        }

        return rotation==Integer.MAX_VALUE ? -1: rotation;


        
    }
    public int check(int x, int[] tops, int[] bottoms){
        int topRotation = 0;
        int bottomRotation = 0;

        for(int i = 0; i<tops.length; i++){
            if(tops[i]!=x && bottoms[i]!=x ){
                return Integer.MAX_VALUE;
            }
            if(tops[i]!=x){
                topRotation++;
            }
            if(bottoms[i]!=x){
                bottomRotation++;
            }
        }
        return Math.min(topRotation, bottomRotation);
    }
}