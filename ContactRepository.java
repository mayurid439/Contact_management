package com.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	    
	}

