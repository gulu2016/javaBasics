package leetcodeFiles;

/**
 * @ProjectName: leetCodePro
 * @Package: leetcodeFiles
 * @ClassName: BasicEveryday
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-29 下午4:45
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-29 下午4:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BasicEveryday {
    public static void sort(int[] a,int low,int high){
        int start = low;
        int end = high;
        int key = a[start];

        while (start < end){
            while (a[end] >= key && start<end)
                end--;
            if(a[end] < key){
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }

            while (a[start] <= key && start < end)
                start++;
            if(a[start] > key){
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if(start > low)
            sort(a,low,start-1);
        if(end < high)
            sort(a,end+1,high);
    }

    public static void main(String []args){
        int[] a = {12,20,5,16,15,1,30,45,23,9};
        int start = 0;
        int end = a.length-1;
        sort(a,start,end);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }
}
