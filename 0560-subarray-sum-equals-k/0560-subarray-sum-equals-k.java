class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
          HashMap<Integer,Integer> mp = new HashMap<>();
                int currsum=0;
                int count=0;
                for(int i=0;i<n;i++)
                        {
                                currsum+=nums[i];
                                    if(currsum==k)
                                {
                                        count++;
                                }
                                
                                if(mp.containsKey(currsum-k))
                                {
                                        count+=mp.get(currsum-k);
                                }
                                mp.put(currsum,mp.getOrDefault(currsum,0)+1);
                        }


                
               
                return count;
        
    }
}