/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.contacts;

import domain.contacts.Contact;
import domain.contacts.ContactService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author florian
 */
@Controller
@RequestMapping("contacts")
public class ContactsController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("contacts", contactService.getContacts());

        return "contacts/contactsView";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String show(@PathVariable("id") int id, Model model) {
        model.addAttribute("contact", contactService.get(id));

        return "contacts/contactView";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String edit(@PathVariable("id") int id, Model model) {
        model.addAttribute("contact", contactService.get(id));

        return "contacts/editView";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    public String start(@PathVariable int id, @Valid @ModelAttribute("contact") Contact contact, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "contacts/editView";
        }
        
        System.out.println(contact.getId());

        contactService.update(contact);
        
        model.addAttribute("contacts", contactService.getContacts());
        return "redirect:../../contacts";
    }
}
