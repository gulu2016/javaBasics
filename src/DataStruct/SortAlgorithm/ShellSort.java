package DataStruct.SortAlgorithm;

/**
 * @ProjectName: leetCodePro
 * @Package: DataStruct.SortAlgorithm
 * @ClassName: ShellSort
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-31 下午5:01
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-31 下午5:01
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 希尔排序
 * 参考博客：https://www.cnblogs.com/oumyye/p/4199449.html
 */
public class ShellSort {
    public static int count = 0;

    public static void shellSort(int[] data) {
        // 计算出最大的h值
        int h = 1;
        while (h <= data.length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            for (int i = h; i < data.length; i += h) {
                if (data[i] < data[i - h]) {
                    int tmp = data[i];
                    int j = i - h;
                    while (j >= 0 && data[j] > tmp) {
                        data[j + h] = data[j];
                        j -= h;
                    }
                    data[j + h] = tmp;
                    print(data);
                }
            }
            // 计算出下一个h值
            h = (h - 1) / 3;
        }
    }

    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] data = new int[] { 4, 3, 6, 2, 1, 9, 5, 8, 7 };
        print(data);
        shellSort(data);
        print(data);

    }
}
