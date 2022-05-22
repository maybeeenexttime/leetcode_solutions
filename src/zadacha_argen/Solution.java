package zadacha_argen;

public class Solution {
    public static void main(String[] args){
        Solution solution = new Solution();
        solution.sumOfTen(0,10);


    }
    public void sumOfTen (int sum, int a) {
        if (a < 1)
        {System.out.println(sum);
        return;
        }
          sumOfTen(sum + a, a - 1 );


    }
}
