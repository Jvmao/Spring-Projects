package com.udemy.backendNinja1.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.backendNinja1.constant.ViewConstant;
import com.udemy.backendNinja1.entity.Contact;
import com.udemy.backendNinja1.model.ContactModel;
import com.udemy.backendNinja1.service.ContactService;

@Controller
@RequestMapping("/contacts")
public class ContactController {
	//3
	private static final Log LOG = LogFactory.getLog(ContactController.class);
	
	//5
	@Autowired
	@Qualifier("contactServiceImpl")
	private ContactService contactService;
	
	//4
	@GetMapping("/cancel") //Desde contacts pasamos a cancel
	public String cancel() {
		return "redirect:/contacts/showcontacts"; //Desde ViewConstant
	}
	
	//11 Modificado
	@PreAuthorize("hasRole('ROLE_USER')")
	
	//1
	@GetMapping("/contactform") //Desde contacts pasamos a contactform
	private String redirectContactForm(@RequestParam(name="id",required=false) int id,
			Model model) {
		//10
		ContactModel contact = new ContactModel();
		if(id != 0) {
			contact = contactService.findContactByIdModel(id);
		}
		model.addAttribute("contactModel", contact);
		return ViewConstant.CONTACT_FORM;
	}
	
	//2
	@PostMapping("/addcontact")
	public String addContact(@ModelAttribute(name="contactModel")ContactModel contactModel, Model model) {
		LOG.info("METHOD: addContact() -- PARAMS: " +contactModel.toString());
		//6
		/*contactService.addContact(contactModel);*/
		
		//7
		if(null !=contactService.addContact(contactModel)) {
			model.addAttribute("result",1);
		}else {
			model.addAttribute("result",0);
		}
		return "redirect:/contacts/showcontacts";
	}
	

	//8
	@GetMapping("/showcontacts")
	public ModelAndView showContacts() {
		ModelAndView mav = new ModelAndView(ViewConstant.CONTACTS);
		
		//12
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		mav.addObject("username",user.getUsername());
		
		mav.addObject("contacts", contactService.listAllContacts());
		return mav;
	}
	
	//9
	@GetMapping("/removecontact")
	public ModelAndView removeContact(@RequestParam(name="id", required=true)int id) {
		contactService.removeContact(id);
		return showContacts();
	}
}
