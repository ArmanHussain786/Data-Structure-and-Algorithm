class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.size()>0 && s.charAt(i)=='#')
                st.pop();
            
            else if(s.charAt(i)!='#')
                st.push(s.charAt(i));
                
        }
        
         Stack<Character> ste = new Stack<>();
        for(int i=0;i<t.length();i++)
        {
            if(ste.size()>0 && t.charAt(i)=='#')
                ste.pop();
            
            else if(t.charAt(i)!='#')
                ste.push(t.charAt(i));
                
        }
        
        String ans ="";
        String ans2 ="";
        while(!st.isEmpty())
        {
           ans = ans + st.pop();
        }
        while(!ste.isEmpty())
        {
           ans2 = ans2 + ste.pop();
        }
        
        return ans.equals(ans2);
    }
}