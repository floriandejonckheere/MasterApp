/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.newsletter;

import domain.newsletter.FrameworkBean;
import domain.newsletter.Newsletter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author florian
 */
@Controller
@RequestMapping("newsletter")
public class NewsletterController {
    
    @Autowired
    private FrameworkBean frameworkBean;
    
    @RequestMapping(method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("newsletter", new Newsletter());
        model.addAttribute("topics", frameworkBean.getWebFrameworkList());

        return "newsletter/formView";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String update(@ModelAttribute("newsletter") Newsletter newsletter, Model model) {
        model.addAttribute("newsletter", newsletter);
        model.addAttribute("topics", frameworkBean.getWebFrameworkList());
        
        return "newsletter/formView";
    }
}
