package observer;

import java.util.Observable;

/**
 * Created by holian on 2017/1/18.
 */
public class NewsObservable extends Observable {
    private String news = "Nothing!";

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers();
    }
}
