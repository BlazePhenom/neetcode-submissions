class Solution {
    public int[] replaceElements(int[] a) {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            int max=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++)
            {
                if(a[j]>max)
                {
                    max=a[j];
                }
            }
            a[i]=max;
        }
        a[n-1]=-1;
        return a;
    }
}