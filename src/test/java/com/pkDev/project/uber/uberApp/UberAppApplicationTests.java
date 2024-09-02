package com.pkDev.project.uber.uberApp;

import com.pkDev.project.uber.uberApp.services.EmailSenderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UberAppApplicationTests {

	@Autowired
	private EmailSenderService emailSenderService;

	@Test
	void contextLoads() {
		emailSenderService.sendEmail(
				"p.kgalexia@gmail.com",
				"This is the Testing Email",
				"Body of my email");
	}

	@Test
	void sendEmailMultiple() {
		String emails[] = {
				"pk12sm@gmail.com",
				"p.mish2702@gmail.com",
		};
		emailSenderService.sendEmail(emails, "Hello from the UBER Application project",
				"This is a good body, I am coding!");
	}

}
