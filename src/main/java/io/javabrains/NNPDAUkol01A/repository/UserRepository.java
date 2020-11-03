package io.javabrains.NNPDAUkol01A.repository;

import io.javabrains.NNPDAUkol01A.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUserName(String userName);

    //User findByUserTokenId(Integer id);

    User findByUserTokenName(String token);
}
