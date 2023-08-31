package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Contact;
import com.service.ContactService;


@RestController
public class ContactController {
	@Autowired
	 private  ContactService contactService;

	
	    @GetMapping("/contacts")
	    public List<Contact> getAllContacts() {
	        return contactService.getAllContacts();
	    }

	    @GetMapping("/{id}")
	    public Contact getContactById(@PathVariable Long id) {
	        return contactService.getContactById(id);
	    }

	    @PostMapping
	    public Contact addContact(@RequestBody Contact contact) {
	        return contactService.saveContact(contact);
	    }

	    @PutMapping("/{id}")
	    public Contact updateContact(@PathVariable Long id, @RequestBody Contact contact) {
	        contact.setId(id);
	        return contactService.saveContact(contact);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteContact(@PathVariable Long id) {
	        contactService.deleteContact(id);
	    }
}

