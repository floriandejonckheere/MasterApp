/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Beer;
import domain.ColorBean;
import domain.ExpertBean;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("beer")
public class BeerController {

    @Autowired
    private ColorBean colorBean;
    
    @Autowired
    private ExpertBean beerExpertBean;
    
    @RequestMapping(method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("beer", new Beer());
        model.addAttribute("colors", colorBean.getColorsList());
        return "formView";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String showResult(@ModelAttribute("beer") Beer beer, BindingResult result, Model model) {
        model.addAttribute("suggestions", beerExpertBean.getExpert(beer.getColor()));
        return "formResult";
    }
}
