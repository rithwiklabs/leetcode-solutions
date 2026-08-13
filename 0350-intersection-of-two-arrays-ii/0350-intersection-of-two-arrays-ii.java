class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> arr = new ArrayList<>();
        int pt1 = 0 , pt2=0;
        while(pt1<nums1.length && pt2<nums2.length)
        {
            if(nums1[pt1] < nums2[pt2] )
                pt1++;
            else if(nums1[pt1] > nums2[pt2] )
                pt2++;
            else
            {
                arr.add(nums1[pt1]);
                pt1++;
                pt2++;
            }
        }
        int[] res = new int[arr.size()];
        int k=0;
        while(k<arr.size())
        {
            res[k]=arr.get(k);
            k++;
        }
        return res;
    }
}