package leetcodeFiles;

//import java.math.BigInteger;
import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class MyStack {

    public static boolean isIdealPermutation(int[] A) {
        //本题中，局部倒置也是一种全局倒置
        //而题目要求全局倒置和局部倒置相等返回true，也就是只有局部倒置的时候返回true
        //那么我们可以求是否存在“真正的”全局倒置（不包括局部倒置的全局倒置）
        //规律就是A[i]-i <=-2 || A[i]-i>=2时，返回false
        if(A.length == 1)
            return true;
        for(int i = 0;i < A.length;i++){
            if(A[i]-i <=-2 || A[i]-i>=2)
                return false;
        }
        return true;
    }

    public static void main(String[] args){
        int[] a = {1,2,0};
        System.out.println(isIdealPermutation(a));
    }
}

