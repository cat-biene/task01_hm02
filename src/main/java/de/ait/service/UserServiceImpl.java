package de.ait.service;

import de.ait.model.User;
import de.ait.repositories.UserCrudRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserCrudRepository repository;

    @Override
    public void addUser(User user) {
        if (userValidate(user)) {
            repository.save(user);
        }
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public boolean userValidate(User user) {
        return !user.getName().isEmpty() && user.getEmail().contains("@");
    }

    @Override
    public User findUserByEmail(String email) {
        return getAllUsers()
                .stream()
                .filter(u->u.getEmail().equals(email))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<User> findBuNameStartingWith(String prefix) {
        return repository.findBuNameStartingWith(prefix);
    }

}
