package DataStruct.TraceBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct.TraceBack
 * @ClassName: CombinationsII
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-4-30 下午6:26
 * @UpdateUser: 更新者
 * @UpdateDate: 19-4-30 下午6:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

//题目描述
public class CombinationsII {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        traceBack(candidates,target,0,ans,new ArrayList<Integer>());
        return ans;
    }

    public static void traceBack(int[] candidates,int target,int pos,List<List<Integer>> ans,List<Integer> temp){
        if(target < 0)
            return;
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = pos;i < candidates.length;i++){
            if(pos<i && candidates[i]==candidates[i-1])
                continue;
            temp.add(candidates[i]);
            traceBack(candidates,target-candidates[i],i+1,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}
