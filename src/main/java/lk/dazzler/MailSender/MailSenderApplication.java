package lk.dazzler.MailSender;

import lk.dazzler.MailSender.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class MailSenderApplication {

	@Autowired
	MailService mailService;

	public static void main(String[] args) {
		SpringApplication.run(MailSenderApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendMain(){
		mailService.sendEmail("dasinduhewagamage@gmail.com",
				"This is the Subject Topic",
				"This is the mail body here.");
	}

}
