package abstractfactory;

public class MysqlDBFactory implements UserDBFactory {
    @Override
    public UserDB createUserDB() {
        return new MysqlUserDB();
    }
}
