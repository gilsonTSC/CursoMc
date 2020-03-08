package com.gilson.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.gilson.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}