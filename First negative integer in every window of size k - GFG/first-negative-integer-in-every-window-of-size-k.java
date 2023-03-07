//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int k)
    {
        Queue<Long> ans = new LinkedList<>();
        ArrayList<Long> res = new ArrayList<>();
        int i=0;
        int j=0;
        long n = A.length;
        while(j<n)
        {
            if(A[j]<0)
            {
                ans.add(A[j]);
            }
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                if(ans.size()==0)
                {
                    res.add((long)0);
                }
                else
                {
                    res.add(ans.peek());
                    if(A[i]==ans.peek())
                    {
                        ans.poll();
                    }
                }
                i++;
                j++;
            }
        }
        long []finalans = new long[res.size()];
        for(int p=0;p<res.size();p++)
        {
            finalans[p]=res.get(p);
        }
        return finalans;
    }
}