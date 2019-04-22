package DataStruct.TraceBack;

import java.util.LinkedList;
import java.util.List;

/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct.TraceBack
 * @ClassName: Subsets
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-4-22 上午9:41
 * @UpdateUser: 更新者
 * @UpdateDate: 19-4-22 上午9:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

//问题描述：https://leetcode-cn.com/problems/subsets/
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        backtrack(ans,new LinkedList<>(),nums,0);
        return ans;
    }

    private static void backtrack(List<List<Integer>> lists,List<Integer> temp,int[] nums,int begin){
        lists.add(new LinkedList<>(temp));
        for(int i = begin;i < nums.length;i++){
            //如果添加当前元素,统计所有情况
            //而到i++之后，就相当于统计没有当前元素的情况
            temp.add(nums[i]);
            backtrack(lists,temp,nums,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
