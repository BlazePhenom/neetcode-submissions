class Solution {
    public int findMin(int[] a) {
        int n=a.length;
        int low=0,high=n-1,mid=0,ans=Integer.MAX_VALUE;
        while(low<=high)
        {
            mid=low+(high-low)/2;

            //left sorted
            if(a[low]<=a[mid])
            {
                ans=Math.min(ans,a[low]);
                low=mid+1;
            }
            //right sorted
             if(a[mid]<=a[high])
            {
                ans=Math.min(ans,a[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}
