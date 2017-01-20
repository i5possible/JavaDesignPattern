package abstractfactory;

public class SqlServerFactory implements UserDBFactory {
    @Override
    public UserDB createUserDB() {
        return new SqlServerUserDB();
    }
}
