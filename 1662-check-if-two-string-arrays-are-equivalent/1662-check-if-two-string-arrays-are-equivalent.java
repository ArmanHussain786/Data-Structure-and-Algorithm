class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String words= "";
        for(int i=0;i<word1.length;i++)
        {
            
            words=words+word1[i];
        }
        String words2 ="";
        for(int i=0;i<word2.length;i++)
        {
            
            words2=words2+word2[i];
        }
        return words.equals(words2);
    }
}