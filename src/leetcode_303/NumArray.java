package leetcode_303;

public class NumArray{
    private int[] nums;
    int[] sumRange;
    public NumArray(int[] nums) {
        this.nums = nums;
        sumRange = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumRange[i] = sum;
        }
    }

    public int sumRange(int left, int right) {

        return left == 0? sumRange[right]: sumRange[right] - sumRange[left - 1];
        //выводим сумму слевого по правый включая левый
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});

        System.out.println(numArray.sumRange(2,5));
    }
}
