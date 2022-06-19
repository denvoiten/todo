package ru.job4j.todo.services;

import net.jcip.annotations.ThreadSafe;
import org.springframework.stereotype.Service;
import ru.job4j.todo.models.User;
import ru.job4j.todo.persistence.UserDBStore;

import java.util.Optional;

@ThreadSafe
@Service
public class UserService {

    private final UserDBStore userDBStore;

    public UserService(UserDBStore userDBStore) {
        this.userDBStore = userDBStore;
    }

    public Optional<User> add(User user) {
        return userDBStore.add(user);
    }

    public Optional<User> findUserByEmailAndPwd(String email, String password) {
        return userDBStore.findUserByEmailAndPwd(email, password);
    }
}
