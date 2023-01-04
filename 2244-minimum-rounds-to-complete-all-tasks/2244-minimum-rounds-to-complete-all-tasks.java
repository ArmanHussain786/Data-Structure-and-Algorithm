class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        }
        int ans=0;
        for(int count:mp.values())
        {
            if(count==1)
            {
                return -1;
            }
            ans=ans+count/3;
            System.out.println(count + " " +ans);
            if(count%3!=0)
                ans++;
        }
        return ans;
        
    }
}