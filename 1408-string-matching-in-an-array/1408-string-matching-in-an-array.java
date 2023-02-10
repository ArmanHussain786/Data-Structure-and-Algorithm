class Solution {
    public List<String> stringMatching(String[] words) {
        HashSet<String> set = new HashSet<>();
        
        for(int i=0;i<words.length-1;i++)
        {
            String currword = words[i];
            for(int j =i+1;j<words.length;j++)
            {
                String nextword = words[j];
                
                if(currword.contains(nextword))
                    set.add(nextword);
                
                if(nextword.contains(currword))
                    set.add(currword);
            }
        }
        List<String> res = new ArrayList<>(set);
        return res;
    }
}