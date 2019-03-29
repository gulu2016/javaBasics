package leetcodeFiles;

import java.util.Scanner;

/**
 * @ProjectName: leetCodePro
 * @Package: leetcodeFiles
 * @ClassName: Main
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-10 下午3:26
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-10 下午3:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //加原点共6个点，到其他5个点的距离
        double[][] distances = new double[6][6];
        int[] Xs = new int[6];
        int[] Ys = new int[6];
        double ans = 0;
        Xs[0] = 0;
        Ys[0] = 0;
        for(int i = 1;i < 6;i++){
            Xs[i] = scanner.nextInt();
            Ys[i] = scanner.nextInt();
        }

        for(int i = 0;i <= 5;i++){
            for(int j = i;j <= 5;j++){
                if(i == j)
                    distances[i][j] = Integer.MAX_VALUE;
                double tempDis = calculateDis(Xs[i],Xs[j],Ys[i],Ys[j]);
                distances[i][j] = tempDis;
                distances[j][i] = tempDis;
            }
        }
        boolean[] aVisitedB = new boolean[6];
        aVisitedB[0] = true;

        int tarPoint = 0;
        int curPoint = 0;
        //一共走了5步，最后一步是返回原点
        for(int i = 0;i < 5;i++){
            tarPoint = getTarPoint(distances,curPoint,aVisitedB);
            ans += distances[curPoint][tarPoint];
            curPoint = tarPoint;
        }
        ans += distances[curPoint][0];
        int finalAnas = (int)ans;
        System.out.println(finalAnas);
    }

    public static double calculateDis(int x1,int x2,int y1,int y2){
        return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }

    public static int getTarPoint(double[][] distances,int i,boolean[] visited){
        double maxValue = Integer.MAX_VALUE;
        for(int k = 0;k < 6;k++){
            //如果是自身或者目标被访问过
            if(k == i || visited[k])
                continue;
            maxValue = Math.min(maxValue,distances[i][k]);
        }
        for(int k = 0;k < 6;k++){
            if(maxValue == distances[i][k])
                return k;
        }
        return 0;
    }
}

