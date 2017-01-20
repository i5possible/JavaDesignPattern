package abstractfactory;

public class SqlServerUserDB implements UserDB {
    @Override
    public void Insert(User user) {
        System.out.println("Insert user use SqlServer!");
    }

    @Override
    public User GetUser(int id) {
        System.out.println("Get user from SqlServer!");
        return new User();
    }
}
