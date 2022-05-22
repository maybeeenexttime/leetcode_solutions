package leetcode_88;

public class Solution {
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        solution.merge(nums1, m, nums2, n);

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = new int[m+n];
        int j = 0;
        int k = 0;
        int i = 0;
        while (i < m && j < n){

          if(nums1[i] > nums2[j]){
              nums3[k++] = nums2[j++];
          }
          else {
              nums3[k++] = nums1[i++];
          }
        }
        while (i < m){
                nums3[k++] = nums1[i++];
        }
        while (j < n){
            nums3[k++] = nums2[j++];
        }
        for (int l = 0; l < m + n; l++) {
            nums1[l] = nums3[l];

        }




    }
}
