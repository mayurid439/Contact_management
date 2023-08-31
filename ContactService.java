package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.ContactRepository;
import com.Entity.Contact;

@Service
public class ContactService {
	
	@Autowired
	  private  ContactRepository contactRepository;

	    public List<Contact> getAllContacts() {
	        return contactRepository.findAll();
	    }

	    public Contact getContactById(Long id) {
	        return contactRepository.findById(id).orElse(null);
	    }

	    public Contact saveContact(Contact contact) {
	        return contactRepository.save(contact);
	    }

	    public void deleteContact(Long id) {
	        contactRepository.deleteById(id);
	    }
	}

