/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.equation;

import domain.equation.EquationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import validator.EquationValidator;

/**
 *
 * @author florian
 */
@Controller
@RequestMapping("equation")
public class EquationController {

    @Autowired
    private EquationValidator equationValidator;
    
    @RequestMapping(method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("equation", new Equation());

        model.addAttribute("operators", new String[]{"+", "-", "*"});
        model.addAttribute("difficulties", new int[]{1, 2, 3});

        return "equation/selectView";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String generate(@ModelAttribute("equation") Equation equation, Model model) {
        List<Integer> eq = EquationService.generateEquation(equation.getOperator(), equation.getDifficulty());

        equation.setLeftHand(eq.get(0));
        equation.setRightHand(eq.get(1));
        equation.setEqResult(eq.get(2));

        return "equation/formView";
    }

    @RequestMapping(value = "/validate", method = RequestMethod.POST)
    public String validate(@ModelAttribute("equation") Equation equation, BindingResult result, Model model) {
        equationValidator.validate(equation, result);
        
        if (!result.hasErrors()) {
            equation.setCorrect(true);
        }
        
        model.addAttribute("equation", equation);
        return "equation/formView";
    }
}
