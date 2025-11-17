package iths.mocking;
public interface UserRepository {
    User findById(String id);
    void save(User user);
}
