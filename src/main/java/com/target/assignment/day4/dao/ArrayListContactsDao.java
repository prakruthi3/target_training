package com.target.assignment.day4.dao;

import com.target.assignment.day4.dao.ContactsDao;
import com.target.assignment.day4.entity.Contact;
import com.target.assignment.day4.entity.Gender;
import com.target.assignment.day4.exception.DaoException;
import com.target.assignment.day4.utils.KeyboardUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class ArrayListContactsDao implements ContactsDao {

    private List<Contact> contacts = new ArrayList<>();

    public ArrayListContactsDao() {


    }

    @Override
    public void addContact(Contact contact) throws DaoException, ParseException {

    }

    @Override
    public Contact getContact(int id) throws DaoException {
        return null;
    }

    @Override
    public void updateContact(Contact contact) throws DaoException, ParseException {

    }

    @Override
    public void deleteContact(int id) throws DaoException {

    }

    @Override
    public Contact getContactByEmail(String email) throws DaoException {
        return null;
    }

    @Override
    public Contact getContactByPhone(String phone) throws DaoException {
        return null;
    }

    @Override
    public List<Contact> getContactsByLastname(String lastname) throws DaoException {
        return null;
    }

    @Override
    public List<Contact> getContactsByCity(String city) throws DaoException {
        return null;
    }

    @Override
    public List<Contact> getContacts() throws DaoException {
        return this.contacts;
    }

    @Override
    public List<Contact> getContactsByBirthDate(Date from, Date to) throws DaoException {
        return null;
    }


}

