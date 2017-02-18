package flyweight;

public class Main {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite blog = webSiteFactory.getWebSiteByCategory("blog");
        blog.use(new User("User 1"));

        WebSite blog2 = webSiteFactory.getWebSiteByCategory("blog");
        blog2.use(new User("User 2"));

        WebSite blog3 = webSiteFactory.getWebSiteByCategory("blog");
        blog3.use(new User("User 3"));

        WebSite show = webSiteFactory.getWebSiteByCategory("product show");
        show.use(new User("User 4"));

        WebSite show2 = webSiteFactory.getWebSiteByCategory("product show");
        show2.use(new User("User 5"));

        WebSite show3 = webSiteFactory.getWebSiteByCategory("product show");
        show3.use(new User("User 6"));

        System.out.println("Total Count : " + webSiteFactory.getWebSiteCount());
    }
}
