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

    //call this function when ever you want to send a mail
    //make sure you pass the values correctly (mail_receiver,mail_sender,mail_subject,mail_content)
    // all you have to do is autowire a reference of this service class wherever u prefer and
    // call this method with passing values
    public String sendEmail(String to, String from, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        //from where the mail is sent
        message.setFrom(from);
        //for whom the mail is sent
        message.setTo(to);
        //subject(topic) of the mail
        message.setSubject(subject);
        //content of the mail (body)
        message.setText(body);

        javaMailSender.send(message);

        return "Mail sent successfully.";
    }
}
