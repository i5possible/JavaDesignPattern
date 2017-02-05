package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by holian on 2017/1/18.
 */
public class NewsObserver implements Observer {
    private String name;

    public NewsObserver() {
    }

    public NewsObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        NewsObservable newsObservable = (NewsObservable) o;
        System.out.println(name + ": Now the news is:" + newsObservable.getNews());
    }
}
