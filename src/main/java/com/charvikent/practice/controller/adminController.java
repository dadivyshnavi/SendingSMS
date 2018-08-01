package com.charvikent.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class adminController {
	
	@Autowired
	MailSender mailSender;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String showadminPage()
	{
		
		System.out.println("enter to jsp page");
		
		
		String from = "leelakrishnacce@gmail.com";
		String to = "leelakrishnacce@gmail.com";
		String subject = "JavaMailSender";
		String body = "Just-Testing!";
		
		mailSender.sendMail(from, to, subject, body);
		
		
		return "admin";
		
		
	}

}
