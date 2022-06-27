package leedcode_39_recursion;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int index=0;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        find(index,candidates,target,list,a);
        return list;
    }

    public void find(int index,int[] arr,int target,List<List<Integer>> ans,
                     List<Integer> d){


        if(index == arr.length){

            if(target ==0){
                ans.add(new ArrayList<>(d));
            }
            return;
        }

        if(arr[index] <=target){
            d.add(arr[index]);
            find(index,arr,target-arr[index],ans,d);
            d.remove(d.size()-1);
        }
        find(index+1,arr,target,ans,d);


    }

        public static void main(String[] args){
            int[] candidates = {2,3,6,7};
            int target = 7;

            Solution solution =  new Solution();
            System.out.println(solution.combinationSum(candidates, target));

        }

}
