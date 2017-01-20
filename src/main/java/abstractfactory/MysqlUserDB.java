package abstractfactory;

public class MysqlUserDB implements UserDB {
    @Override
    public void Insert(User user) {
        System.out.println("Insert user in mysqlDB!");
    }

    @Override
    public User GetUser(int id) {
        System.out.println("Get user from mysqlDB!");
        return null;
    }
}
