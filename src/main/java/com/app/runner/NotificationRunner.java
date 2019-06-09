package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.service.INotificationService;

@Component
public class NotificationRunner implements CommandLineRunner {

	@Autowired
	public INotificationService service;
	
	public void run(String... args) throws Exception {
		service.notificate();

	}

}
