class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        int count=0;
        for(int i=0;i<tickets.length;i++)
        {
            q.add(i);
        }
        while(!q.isEmpty())
        {
            count++;
            int temp = q.peek();
            q.remove();
            if(tickets[temp]>=1)
            {
                tickets[temp]-=1;
            }
            if(temp!=k && tickets[temp]==0)
            {
                continue;
            }
            if(temp==k && tickets[temp]==0)
            {
                break;
            }
            q.add(temp);
        }
        return count;
    }
}