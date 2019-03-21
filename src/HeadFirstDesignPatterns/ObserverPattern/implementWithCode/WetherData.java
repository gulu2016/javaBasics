package HeadFirstDesignPatterns.ObserverPattern.implementWithCode;

import java.util.ArrayList;

/**
 * @ProjectName: leetCodePro
 * @Package: HeadFirstDesignPatterns.ObserverPattern
 * @ClassName: WetherData
 * @Description: java类作用描述
 * @Author: gulu
 * @CreateDate: 19-3-20 下午9:15
 * @UpdateUser: 更新者
 * @UpdateDate: 19-3-20 下午9:15
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class WetherData implements Subject {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WetherData(){
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0)
            observers.remove(i);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0;i < observers.size();i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
