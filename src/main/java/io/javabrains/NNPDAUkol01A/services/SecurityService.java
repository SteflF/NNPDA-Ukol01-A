package io.javabrains.NNPDAUkol01A.services;

import io.javabrains.NNPDAUkol01A.model.RecoverPasswordInputModel;
import io.javabrains.NNPDAUkol01A.model.ResetPasswordInputModel;

public interface SecurityService {
    String recoverPassword(RecoverPasswordInputModel inputModel);

    boolean resetPassword(ResetPasswordInputModel inputModel);

    boolean resetPasswordTokenValidation(String token);
}
