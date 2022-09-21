package com.contact.userservicecontact.service;

import java.util.List;

import com.contact.userservicecontact.entity.Contact;

public interface ContactService {

    public List<Contact> getContactsOfUser(Long userId);

}