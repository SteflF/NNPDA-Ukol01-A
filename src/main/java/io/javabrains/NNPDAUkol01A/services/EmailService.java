package io.javabrains.NNPDAUkol01A.services;

public interface EmailService {

    void sendPasswordRecoveryEmail(String to, String token);
}
