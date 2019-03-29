package DataStruct.SortAlgorithm;

/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct
 * @ClassName: mergeSort
 * @Description: java实现的归并排序
 * @Author: gulu
 * @CreateDate: 19-3-11 下午7:35
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-11 下午7:35
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * 参考博客：https://www.cnblogs.com/of-fanruice/p/7678801.html
 */
public class mergeSort {
    public static int[] sort(int[] a,int low,int high){
        int mid = (low+high)/2;
        if(low<high){
            //分割部分
            sort(a,low,mid);
            sort(a,mid+1,high);
            //左右归并
            merge(a,low,mid,high);
        }
        return a;
    }

    public static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i= low;
        int j = mid+1;
        int k=0;
        // 把较小的数先移到新数组中
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                temp[k++] = a[i++];
            }else{
                temp[k++] = a[j++];
            }
        }
        // 把左边剩余的数移入数组
        while(i<=mid){
            temp[k++] = a[i++];
        }
        // 把右边边剩余的数移入数组
        while(j<=high){
            temp[k++] = a[j++];
        }
        // 把新数组中的数覆盖nums数组
        for(int x=0;x<temp.length;x++){
            a[x+low] = temp[x];
        }
    }

    public static void main(String[] args){
        int[] a = {3,6,18,2,4,9,6,7};
        int[] b = sort(a,0,7);
        for(Integer i: b)
            System.out.print(i+" ");
    }
}
