class Solution {
    public int secondHighest(String s) {
        HashSet<Integer> mp = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
            {
                mp.add(s.charAt(i)-'0');
                System.out.println(s.charAt(i));
            }
                
        }
        ArrayList<Integer> res = new ArrayList<>(mp);
        Collections.sort(res);
        if(res.size()<=1 )
            return -1;
        else
            return res.get(res.size()-2);
    }
}