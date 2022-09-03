package com.microserviceemail.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.microserviceemail.enums.StatusEmail;
import com.microserviceemail.models.EmailModel;
import com.microserviceemail.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	EmailRepository emailRepository;
	
	@Autowired
	private JavaMailSender emailSender;

	public EmailModel sendEmail(EmailModel emailModel) {
		emailModel.setSendDateEmail(LocalDateTime.now());
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(emailModel.getEmailFrom());
			message.setTo(emailModel.getEmailFrom());
			message.setSubject(emailModel.getSubject());
			message.setText(emailModel.getText());
			emailSender.send(message);
			
			emailModel.setStatusEmail(StatusEmail.SENT);
			
		}catch (MailException e) {
			emailModel.setStatusEmail(StatusEmail.ERROR);
		}finally {
			return emailRepository.save(emailModel);
		}
		
	}
	
}
