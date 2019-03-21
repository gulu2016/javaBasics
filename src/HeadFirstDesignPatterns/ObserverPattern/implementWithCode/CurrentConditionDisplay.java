package HeadFirstDesignPatterns.ObserverPattern.implementWithCode;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ObserverPattern
 * @ClassName: CurrentConditionDisplay
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-20 下午9:24
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-20 下午9:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 *
 * 模拟告示版
 */
public class CurrentConditionDisplay implements Observer,DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current conditions:"+temperature+"F degrees and "+
                humidity+"% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
