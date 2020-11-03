package io.javabrains.NNPDAUkol01A.services;

import io.javabrains.NNPDAUkol01A.model.UserToken;

public interface UserTokenService {
    UserToken findById(int id);

    UserToken findByName(String token);
}
