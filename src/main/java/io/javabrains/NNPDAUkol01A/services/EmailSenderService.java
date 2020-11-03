package io.javabrains.NNPDAUkol01A.services;

import org.springframework.mail.SimpleMailMessage;

public interface EmailSenderService {

    void sendEmail(SimpleMailMessage message);
}
