package com.marcospivetta.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.marcospivetta.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
