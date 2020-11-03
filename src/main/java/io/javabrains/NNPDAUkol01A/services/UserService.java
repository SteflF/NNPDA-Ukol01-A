package io.javabrains.NNPDAUkol01A.services;

import io.javabrains.NNPDAUkol01A.model.ChangePasswordInputModel;
import io.javabrains.NNPDAUkol01A.model.User;
import io.javabrains.NNPDAUkol01A.model.UserInputModel;

public interface UserService {
    User findOne(String userName);

    User save(UserInputModel user);

    Boolean changePassword(ChangePasswordInputModel inputModel);
}
