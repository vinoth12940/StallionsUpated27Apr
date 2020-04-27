package com.stallionscc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.stallionscc.entity.Mail;
import com.stallionscc.service.MailRepository;


@Controller
@RequestMapping("/welcome")
public class HomeController {

	@Autowired
	MailRepository mailRepository;

	
	@GetMapping("/")
	public String showWelcome() {
		return "welcome";
	}
	
	@GetMapping("/gallery")
	public String showgallery() {
		return "gallery";
	}
	
	@GetMapping("/aboutUs")
	public String showAboutUs() {
		return "aboutUs";
	}
	
			
	@GetMapping("/contactUs")
	public ModelAndView contactUs(@ModelAttribute("mail") Mail mail, BindingResult result, Model model1) {
	    ModelAndView mav = new ModelAndView("contactUs");
	    mav.addObject("contactUs", new Mail());
	    return mav;
	}
	
	@PostMapping("/mailSuccess")
	public ModelAndView mailSuccess(@ModelAttribute("mail") Mail mail, BindingResult result) {
		
		 
	        mail.setMailFrom(mail.getMailFrom());
	        mail.setMailTo("mailtostallionscc@gmail.com");
	        mail.setMailSubject(mail.getMailSubject());
	 
	        Map < String, Object > model = new HashMap < String, Object > ();
	        model.put("firstName", mail.getFirstName());
	        model.put("mobileNo", mail.getMobileNo());
	        model.put("mailContent", mail.getMailContent());
	        model.put("location", "Chennai");
	        model.put("signature", "www.stallionsCC.com");
	        mail.setModel(model);
	        
	        mailRepository.sendEmail(mail);
	        
	    ModelAndView mav = new ModelAndView("mailSuccess");
	    mav.addObject("mailSuccess", new Mail());
	    return mav;
	}

}
