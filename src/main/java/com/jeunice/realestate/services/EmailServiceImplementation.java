package com.jeunice.realestate.services;
import com.jeunice.realestate.dao.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImplementation implements EmailRepository {
    @Autowired
    private JavaMailSender mailSender;
    @Override
    public void sendEmail(SimpleMailMessage email) {
        mailSender.send(email);
    }
}
