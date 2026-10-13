class Solution {
    public int search(int[] a, int x) {
        int n=a.length;
        int low=0,high=n-1,mid=0;
        while(low<=high)
        {
            mid=low+(high-low)/2;

            if(a[mid]==x) return mid;

            //left sorted
            else if(a[low]<=a[mid])
            {
                if(a[low]<=x && x<=a[mid])
                high=mid-1;
                else
                low=mid+1;
            }
            //right sorted
            else if(a[mid]<=a[high])
            {
                if(a[mid]<=x && x<=a[high])
                low=mid+1;
                else
                high=mid-1;
            }
        }
        return -1;
    }
}
