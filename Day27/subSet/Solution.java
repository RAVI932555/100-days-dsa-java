import java.util.*;
class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        solve(nums, 0, res, subset);
        return res;     
    }
    public static void solve(int[] nums, int index, List<List<Integer>> res, List<Integer> subset){
        if (index == nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[index]);
        solve(nums, index + 1, res, subset);

        subset.remove(subset.size() - 1);
        solve(nums, index + 1, res, subset);
    }
    public static void main(String arg[]){
        List<List<Integer>> list=subsets(new int[]{1,2,3});

    }
}