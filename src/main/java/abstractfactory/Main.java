package abstractfactory;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        UserDBFactory userDBFactory = new SqlServerFactory();
        UserDB userDB = userDBFactory.createUserDB();
        userDB.Insert(user);
        userDB.GetUser(1);
    }
}
