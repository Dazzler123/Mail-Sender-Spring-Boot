/**
 * #=== Created by Dazzler7Soft.Eng.Udg ===#
 * Date : 11-Jul-2023
 * Time : 3:08 PM
 * Project Name : Mail-Sender
 */
package lk.dazzler.MailSender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("dasinduhewagamage@gmail.com");
        message.setTo(to);
        message.setSubject(subject);
        message.setText(body);

        javaMailSender.send(message);

        System.out.println("Mail Sent.");
    }
}
