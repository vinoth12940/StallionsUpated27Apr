package com.stallionscc.service;

import com.stallionscc.entity.Mail;

public interface IMailRepository {
	
	public void sendEmail(Mail mail);
}
