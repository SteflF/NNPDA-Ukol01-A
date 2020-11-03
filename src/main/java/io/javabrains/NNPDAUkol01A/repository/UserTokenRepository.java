package io.javabrains.NNPDAUkol01A.repository;

import io.javabrains.NNPDAUkol01A.model.UserToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTokenRepository extends CrudRepository<UserToken, Integer> {
    UserToken findByName(String token);
}
