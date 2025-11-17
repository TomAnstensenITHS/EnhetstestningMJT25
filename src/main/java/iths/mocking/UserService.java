package iths.mocking;
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User getUser(String id) {
        return repository.findById(id);
    }

    public void updateUserName(String id, String newName) {
        User user = repository.findById(id);
        if (user == null) {
            throw new IllegalArgumentException("User not found: " + id);
        }
        user.setName(newName);
        repository.save(user);
    }
}
