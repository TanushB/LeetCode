//https://leetcode.com/problems/median-of-two-sorted-arrays/
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        //case 1.1 arrays are already in order
        if (nums1[nums1.length-1]<=nums2[0]){
            if (totalLength%2==0){
                return (double)((combIndex(nums1, nums2, totalLength/2)+combIndex(nums1, nums2, totalLength/2 - 1))/2.0);
            }
            return (double)combIndex(nums1, nums2, totalLength/2);
        }
        
        //case 1.2 arrays are in reverse order
        if (nums2[nums2.length-1]<=nums1[0]) return findMedianSortedArrays(nums2, nums1);

        //case 2.1 not in order and nums1 is shorter
        if (nums1.length<=nums2.length){
            
        }
    }

    private int combIndex(int[] nums1, int[] nums2, int ind){
        if (ind-nums1.length < 0) return nums1[ind]; //arr1
        else return nums2[ind-nums1.length]; //arr2
    }
}