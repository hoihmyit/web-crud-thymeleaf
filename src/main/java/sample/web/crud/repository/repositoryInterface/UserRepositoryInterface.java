package sample.web.crud.repository.repositoryInterface;

import sample.web.crud.model.User;

public interface UserRepositoryInterface {

    Iterable<User> findAll();

    User save(User user);

    User findUser(Long id);

    void deleteUser(Long id);
}
