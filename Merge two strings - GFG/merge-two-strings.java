//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String input_line[] = read.readLine().trim().split("\\s+");
            String S1 = input_line[0];
            String S2 = input_line[1];
            Solution ob = new Solution();
            System.out.println(ob.merge(S1,S2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        int start=0;
        int start2 =0;
        String mer = "";
        while(start!=S1.length()  && start2!=S2.length())
        {
            mer = mer + S1.charAt(start);
            mer = mer + S2.charAt(start2);
            
            start++;
            start2++;
        }
        
        while(start!=S1.length())
        {
            mer = mer + S1.charAt(start);
            start++;
        }
        while(start2!=S2.length())
        {
            mer = mer + S2.charAt(start2);
            start2++;
        }
        
       // System.out.println(mer);
        return mer;
    }
} 