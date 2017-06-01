/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.inventory;

import domain.inventory.Crease;
import domain.inventory.ProductManager;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author florian
 */
@Controller
@RequestMapping("inventory")
public class InventoryController {
    
    @Autowired
    private ProductManager productManager;
    
    @RequestMapping(method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("products", productManager.getProducts());

        return "inventory/inventoryView";
    }
    
    @RequestMapping(value = "{edit}", method = RequestMethod.GET)
    public String edit(Model model) {
        model.addAttribute("crease", new Crease());
        
        return "inventory/formView";
    }
    
    @RequestMapping(value = "{edit}", method = RequestMethod.POST)
    public String update(@Valid @ModelAttribute("crease") Crease crease, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "inventory/formView";
        }
        
        productManager.increasePrice(crease.getIncrease());
        productManager.decreasePrice(crease.getDecrease());
        
        model.addAttribute("products", productManager.getProducts());
        return "redirect:../inventory";
    }
}
