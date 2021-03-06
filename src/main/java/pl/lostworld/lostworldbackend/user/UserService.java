package pl.lostworld.lostworldbackend.user;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User findByUsername(String username);

    User saveUser(User user);

    public User findUserById(Long id);

    public void deleteUserById(Long id);

    public List<User> findUsers();
}