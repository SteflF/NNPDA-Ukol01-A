package io.javabrains.NNPDAUkol01A.services.impl;

import io.javabrains.NNPDAUkol01A.services.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service("emailSenderService")
public class EmailSenderServiceImpl implements EmailSenderService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendEmail(SimpleMailMessage message) {
        mailSender.send(message);
    }
}
