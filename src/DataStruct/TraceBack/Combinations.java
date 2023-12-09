package DataStruct.TraceBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct.TraceBack
 * @ClassName: Combinations
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-4-5 上午8:50
 * @UpdateUser: 更新者
 * @UpdateDate: 19-4-5 上午8:50
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

//leetcode链接：https://leetcode-cn.com/submissions/detail/16296976/
//问题描述
//给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
//
//        candidates 中的每个数字在每个组合中只能使用一次。
//
//        说明：
//
//        所有数字（包括目标数）都是正整数。
//        解集不能包含重复的组合。
//
//        示例 1:
//
//        输入: candidates = [10,1,2,7,6,1,5], target = 8,
//        所求解集为:
//        [
//        [1, 7],
//        [1, 2, 5],
//        [2, 6],
//        [1, 1, 6]
//        ]

public class Combinations {
    public static void backTrace(List<List<Integer>> res, List<Integer> list, int[] nums, int target, int remain, int start){
        if(remain < 0)
            return;
        else if(remain == 0)
            res.add(new ArrayList<>(list));
        else {
            for(int i = start;i < nums.length;i++){
                //如果一样，直接跳过，否则加入集合也是重复的
                if(start<i && nums[i]==nums[i-1])
                    continue;
                //对于每个数，都有添加和不填加两种可能
                //添加该数，进行递归
                list.add(nums[i]);
                backTrace(res,list,nums,target,remain-nums[i],i+1);
                //删除该数，进行递归
                list.remove(list.size()-1);
            }
        }
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        backTrace(res,list,candidates,target,target,0);
        return res;
    }

    public static void main(String[] args){
        int[] a = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> ans = combinationSum2(a,target);

        for(List<Integer> l:ans){
            for(Integer i:l){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
