package domain.contacts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author florian
 */
public class ContactService {

    private Map<Integer, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public List<Contact> getContacts() {
        List<Contact> _contacts = new ArrayList<>();
        contacts.values().forEach((c) -> {
            _contacts.add(c);
        });

        return _contacts;
    }

    public Contact get(int id) {
        return contacts.get(id);
    }

    public void update(Contact contact) {
        contacts.put(contact.getId(), contact);
    }
}
