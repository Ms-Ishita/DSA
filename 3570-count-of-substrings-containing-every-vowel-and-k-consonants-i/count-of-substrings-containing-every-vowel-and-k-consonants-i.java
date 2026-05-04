class Solution {
    // public boolean countVowels(char ch){
    //     return ch=='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'   ; 
    // }
    public int countOfSubstrings(String word, int k) {
        int n = word.length();
        int count = 0;
        for(int left =0; left<n; left++){
            int consonent = 0;
            int[] vowels = new int[5];
            for(int right = left; right<n; right++){
                char ch = word.charAt(right);
                //if(countVowels(ch)){
                    if(ch == 'a')vowels[0]++;
                    else if(ch == 'e')vowels[1]++;
                    else if(ch == 'i')vowels[2]++;
                    else if(ch == 'o')vowels[3]++;
                    else if(ch == 'u')vowels[4]++;
                //}
                else {
                    consonent++;
                }
                 if(consonent == k &&
                   vowels[0]>0 &&
                   vowels[1]>0 &&
                   vowels[2]>0 &&
                   vowels[3]>0 &&
                   vowels[4]>0){
                        count++;
                }


            }

        }
        return count;
    }
}
// class Solution {

//     private boolean isVowel(char c){
//         return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
//     }

//     public int countOfSubstrings(String word, int k) {

//         int n = word.length();
//         int count = 0;

//         for(int left = 0; left < n; left++){

//             int consonants = 0;
//             int[] vowel = new int[5];

//             for(int right = left; right < n; right++){

//                 char ch = word.charAt(right);

//                 if(isVowel(ch)){
//                     if(ch=='a') vowel[0]++;
//                     else if(ch=='e') vowel[1]++;
//                     else if(ch=='i') vowel[2]++;
//                     else if(ch=='o') vowel[3]++;
//                     else vowel[4]++;
//                 }
//                 else{
//                     consonants++;
//                 }

               
//                 if(consonants == k &&
//                    vowel[0]>0 &&
//                    vowel[1]>0 &&
//                    vowel[2]>0 &&
//                    vowel[3]>0 &&
//                    vowel[4]>0){
//                         count++;
//                 }
//             }
//         }

//         return count;
//     }
// }