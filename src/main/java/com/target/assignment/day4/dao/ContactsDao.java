package com.target.assignment.day4.dao;

import com.target.assignment.day4.entity.Contact;
import com.target.assignment.day4.exception.DaoException;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface ContactsDao {

    //CRUD operations
    public void addContact(Contact contact) throws DaoException,ParseException;
    public Contact getContact(int id) throws DaoException;
    public void updateContact(Contact contact) throws DaoException,ParseException;
    public void deleteContact(int id) throws DaoException;

    // Queries
    public Contact getContactByEmail(String email) throws DaoException;
    public Contact getContactByPhone(String phone) throws DaoException;
    public List<Contact> getContactsByLastname(String lastname) throws DaoException;
    public List<Contact> getContactsByCity(String city) throws DaoException;
    public List<Contact> getContacts() throws DaoException;
    public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException;
}
