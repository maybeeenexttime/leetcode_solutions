package leetcode_11;

public class Solution {
    public int maxArea(int[] height) {
        int index = 0;
        int end = height.length - 1;
        int areaSum = 0;

        while (index < end){
           int currentArea = Math.min(height[index],height[end]) * (end - index);
           if(height[index] < height[end]){
               index++;
           }else {
               end--;
           }
            areaSum = Math.max(areaSum, currentArea);
        }
        return areaSum;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution solution = new Solution();
        System.out.println(solution.maxArea(height));
    }
}
