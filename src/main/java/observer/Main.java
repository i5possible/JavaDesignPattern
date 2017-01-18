package observer;

/**
 * Created by holian on 2017/1/18.
 */
public class Main {
    public static void main(String[] args) {
        NewsObservable newsObservable = new NewsObservable();
        NewsObserver lh = new NewsObserver("lh");
        NewsObserver kevin = new NewsObserver("kevin");
        NewsObserver zyc = new NewsObserver("YuCheng Zhang");
        newsObservable.addObserver(lh);
        newsObservable.addObserver(kevin);
        newsObservable.addObserver(zyc);
        newsObservable.setNews("New news!");
        newsObservable.setNews("Big news!");
    }
}
