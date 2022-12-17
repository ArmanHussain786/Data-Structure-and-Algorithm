class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> res = new ArrayList<>();
        int sum=0;
        for(int i=0;i<operations.length;i++)
        {
            if(!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+"))
            {
                int roundScore = Integer.valueOf(operations[i]);
                sum+=roundScore;
                res.add(roundScore);
            }
            else if(operations[i].equals("C"))
            {
                sum-=res.get(res.size()-1);
                res.remove(res.size()-1);
            }
            else if(operations[i].equals("D"))
            {
                int roundScore =2*res.get(res.size()-1);
                sum+=roundScore;
                res.add(roundScore);
            }
            else 
            {
                int roundScore=res.get(res.size()-1) + res.get(res.size()-2);
                sum+=roundScore;
                res.add(roundScore);
            }
        }
        return sum;
    }
}