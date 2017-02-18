package flyweight;

import java.util.Hashtable;

public class WebSiteFactory {
    private Hashtable<String, WebSite> flyweights;

    public WebSiteFactory() {
        flyweights = new Hashtable<>();
    }

    public WebSite getWebSiteByCategory(String category) {
        if (!flyweights.containsKey(category)) {
            flyweights.put(category, new ConcreteWebSite("category"));
        }
        return flyweights.get(category);
    }

    public int getWebSiteCount() {
        return flyweights.size();
    }
}
