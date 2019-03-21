package HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil
 * @ClassName: WeatherStation
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 上午9:33
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 上午9:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class WeatherStation {
    public static void main(String[] args){
        WeatherData wetherData = new WeatherData();

        CurrentConditionsDisplay currentConditionDisplay =
                new CurrentConditionsDisplay(wetherData);
        wetherData.setMeasurements(80,65,30.4f);
        wetherData.setMeasurements(82,70,29.2f);
        wetherData.setMeasurements(78,90,29.2f);
    }
}
