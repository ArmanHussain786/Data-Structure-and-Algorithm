class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String []arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
      HashMap<String,Boolean> mp = new HashMap<>();
        
       
        for(int i=0;i<words.length;i++)
        {
            
            String ans ="";
            for(int j=0;j<words[i].length();j++)
            {
                ans+=arr[words[i].charAt(j)-'a'];
            }
            
            mp.put(ans,true);
        }
        
        return mp.size();
    }
}