package ru.itmentor.crud.repository;

import ru.itmentor.crud.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    void save(User user);

    void update(User user);

    void delete(Long id);

    Optional<User> findById(Long id);

    List<User> findAll();
}
