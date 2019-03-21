package HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil;


import java.util.Observable;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil
 * @ClassName: WeatherData
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 上午9:20
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 上午9:20
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressuer;

    public WeatherData(){}

    public void measurementsChaged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressuer){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressuer = pressuer;
        measurementsChaged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressuer() {
        return pressuer;
    }
}
