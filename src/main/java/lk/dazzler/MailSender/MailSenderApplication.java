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
		//who we want to send the mail
		mailService.sendEmail("dasinduhewagamage@gmail.com",
				"Spring Boot Mail Sending - JavaMailSending ",
				"Once upon a time in a cozy little town, there lived a friendly dog named Buddy and a curious child named Lily. Buddy was a loyal companion known for his wagging tail and Lily was an imaginative and adventurous girl with a heart full of dreams.\n" +
						"\n" +
						"Every morning, Buddy would eagerly wait at the front gate for Lily to come out and play. As soon as Lily stepped outside, Buddy would joyfully jump around, showering her with warm, wet kisses. They were the best of friends and shared many wonderful adventures together.\n" +
						"\n" +
						"One sunny day, as they strolled through a picturesque meadow, they discovered a hidden treasure buried beneath a tall oak tree. Lily's eyes sparkled with excitement, and she exclaimed, \"Buddy, let's dig it up and see what's inside!\"\n" +
						"\n" +
						"With their paws and hands covered in soil, they carefully unearthed a dusty old box. As they opened it, their eyes widened in awe. Inside was a magical map that led them to a mystical world filled with talking animals, enchanted forests, and sparkling rivers.\n" +
						"\n" +
						"Buddy and Lily embarked on a thrilling journey, meeting wise owls, playful squirrels, and mischievous rabbits along the way. They discovered secret caves, climbed towering mountains, and even rescued a lost baby bird.\n" +
						"\n" +
						"But their most memorable adventure was when they encountered a kind-hearted unicorn named Sparkle. Sparkle granted them a wish, and without hesitation, Lily wished for all the dogs in the world to have loving homes.\n" +
						"\n" +
						"From that day forward, Buddy and Lily dedicated their lives to helping dogs in need. They started a dog rescue organization, finding loving families for abandoned and stray dogs. Their efforts brought smiles to many faces, both canine and human alike.\n" +
						"\n" +
						"Years passed, and Buddy and Lily grew older. Though their bodies became tired, their spirits remained forever young. Their bond had grown stronger with time, teaching them the true meaning of friendship, compassion, and the joy of giving.\n" +
						"\n" +
						"Even now, in the hearts of the townsfolk, the legend of Buddy and Lily lives on. Their story continues to inspire children and adults to care for animals and cherish the magical moments that come from genuine friendship.\n" +
						"\n" +
						"And so, as the sun sets over the meadow, Buddy and Lily rest, knowing that they have made the world a better place, one wagging tail at a time");
	}

}
