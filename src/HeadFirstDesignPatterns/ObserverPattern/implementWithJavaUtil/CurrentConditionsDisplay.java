package HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Observable;
import java.util.Observer;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ObserverPattern.implementWithJavaUtil
 * @ClassName: CurrentConditionsDisplay
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-21 上午9:26
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-21 上午9:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class CurrentConditionsDisplay implements Observer {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display(){
        System.out.println("Current conditions:"+temperature
        +"F degrees and "+humidity+"% humidity");
    }
}
