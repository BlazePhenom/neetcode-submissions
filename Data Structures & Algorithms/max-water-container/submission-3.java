class Solution {
    public int maxArea(int[] hts) {
        int n=hts.length;
        if(n==2)
        return Math.min(hts[0],hts[1]);
        int l=0;
        int r=n-1;
        int area=1;
        int maxarea=1;
        while(l<r)
        {
            area=(r-l)*Math.min(hts[r],hts[l]);
            if(hts[l]<hts[r])
            l++;
            else
            r--;
            maxarea=Math.max(maxarea,area);
        }
        return maxarea;
    }
}
