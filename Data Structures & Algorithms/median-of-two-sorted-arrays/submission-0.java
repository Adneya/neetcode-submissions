class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l3=nums1.length+nums2.length;
        int[] arr=new int[l3];
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
        double median=0.0;
        int n=arr.length;
        if(n%2==0)
        {
            median=(double)(arr[n/2]+arr[n/2-1])/2.0;
        }
        else
        {
            median=(double)(arr[n/2]);
        }
        return median;
    }
}
