class Solution {
    public int maxProfit(int[] a) {
        
        int p=0;
        for(int i=1;i<a.length;i++)
            {
                if(a[i]>a[i-1])
                    {
                        p+=a[i]-a[i-1];
                    }
            }
        return p;    
    }
    
}
