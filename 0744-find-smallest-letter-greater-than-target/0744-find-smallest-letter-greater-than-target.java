class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int []freq = new int[26];
        for(int i=0;i<letters.length;i++)
        {
            freq[letters[i]-'a']++;
            //System.out.println(freq[i]);
        }
        char res =letters[0];
        int check = target-'a';
        //System.out.println(check);
        for(int i=0;i<freq.length;i++)
        {
            if( i>check && freq[i]>0)
            {
               // 
                res=(char)(i+'a');
                break;
            }
        }
        return res;
    }
}