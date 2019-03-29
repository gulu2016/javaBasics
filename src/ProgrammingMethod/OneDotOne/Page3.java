package ProgrammingMethod.OneDotOne;

/**
 * @ProjectName: leetCodePro
 * @Package: ProgrammingMethod.OneDotOne
 * @ClassName: Page3
 * @Description: 对应位置（解法二：三步旋转）
 * @Author: gulu
 * @CreateDate: 19-1-21 下午6:55
 * @UpdateUser: 更新者
 * @UpdateDate: 19-1-21 下午6:55
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class Page3 {

//第一种方法：书上的方法，三次旋转
    public static String ReverseString(String s,int from,int to){
        char[] chars = s.toCharArray();
        while (from < to){
            char t = chars[from];
            chars[from] = chars[to];
            from++;
            chars[to] = t;
            to--;
        }
        return new String(chars);
    }

    //m是要向左移动的个数，n是单词的长度
    public static String LeftRotateString(String s,int n,int m){
        //如果左移大于n位，那么与%n是等价的
        m %= n;
        s = ReverseString(s,0,m-1);
        s = ReverseString(s,m,n-1);
        s = ReverseString(s,0,n-1);
        return s;
    }

//第二种方法：自己想的，使用java中substring方法
    //m是要向左移动的个数，n是单词的长度
    public static String LeftRotateString2(String s,int n,int m){
        //如果左移大于n位，那么与%n是等价的
        m %= n;
        String leftSubString = s.substring(0,m);
        String rightSubString = s.substring(m,n);
        return rightSubString+leftSubString;
    }
    public static void main(String[] args){
        System.out.println(LeftRotateString2("leetcode",8,2));
    }
}
