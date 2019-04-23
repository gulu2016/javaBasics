package DataStruct.TraceBack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct.TraceBack
 * @ClassName: TreeCombination
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-4-23 下午8:29
 * @UpdateUser: 更新者
 * @UpdateDate: 19-4-23 下午8:29
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */

//这种类型的组合类似于树形结构
//题目描述：https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
public class TreeCombination {

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0)
            return ans;
        HashMap<Character,String> numToStr = new HashMap<>();
        numToStr.put('2',"abc");
        numToStr.put('3',"def");
        numToStr.put('4',"ghi");
        numToStr.put('5',"jkl");
        numToStr.put('6',"mno");
        numToStr.put('7',"pqrs");
        numToStr.put('8',"tuv");
        numToStr.put('9',"wxyz");
        find(digits,0,new String(),ans,numToStr);
        return ans;

    }

    public static void find(String digits,int index,String s,List<String> ans,HashMap<Character,String> numToStr){
        if(index == digits.length()){
            ans.add(s.toString());
        }
        else {
            String a = numToStr.get(digits.charAt(index));
            for(int i = 0;i < a.length();i++){
                find(digits,index+1,s+a.charAt(i),ans,numToStr);
            }
        }
    }
}
