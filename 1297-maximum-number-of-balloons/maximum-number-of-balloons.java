class Solution {
    public int maxNumberOfBalloons(String text) {
       
       int[] arr = new int[5];
       for(int i = 0; i<text.length(); i++){
        if(text.charAt(i)=='b'){
            arr[0]++;

        }
        if(text.charAt(i)=='a'){
            arr[1]++;
        }
        if(text.charAt(i)=='l'){
            arr[2]++;
            
        }
        if(text.charAt(i)=='o'){
            arr[3]++;
           
        }
        if(text.charAt(i)=='n'){
            arr[4]++;
        }

       }


    
    arr[2]=(arr[2])/2;arr[3]=(arr[3])/2;

    int min = arr[0];for(
    int i = 0;i<arr.length;i++){
        if(min>arr[i]){
            min = arr[i];
        }
    }

    return min;
    }

}