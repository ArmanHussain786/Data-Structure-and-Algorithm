class Solution {
    public int countGoodSubstrings(String s) {
        int i=0;
        int j=0;
        int len = s.length();
        int count=0;
        int k=3;
        HashMap<Character,Integer> mp = new HashMap<>();
        while(j<len)
        {
            mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                if(mp.size()==k)
                {
                    count++;
                }
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)-1);
                if(mp.get(s.charAt(i))==0)
                {
                    mp.remove(s.charAt(i));
                }
                i++;
                j++;
            }
        }
        return count;
    }
}


 // int ans=0;
 //        int i=0,j=0,n=s.length(),k=3;
 //        unordered_map<char,int>mp;
 //        while(j<n){
 //            mp[s[j]]++;
 //            if(j-i+1<k){
 //                j++;
 //            }
 //            else if(j-i+1==k){
 //                if(mp.size()==k){
 //                    ans++;
 //                }
 //                mp[s[i]]--;
 //                if(mp[s[i]]==0){
 //                    mp.erase(s[i]);
 //                }
 //                i++;
 //                j++;
 //            }
 //        }
 //        return ans;