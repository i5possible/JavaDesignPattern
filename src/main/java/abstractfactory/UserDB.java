package abstractfactory;

public interface UserDB {
    void Insert(User user);
    User GetUser(int id);
}
