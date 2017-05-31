/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.game;

import domain.game.Game;
import domain.game.GameService;
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
@RequestMapping("game")
public class GameController {

    @Autowired
    private GameService gameService;
    
    @RequestMapping(method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("game", gameService.getInstance());

        return "game/formView";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String start(@Valid @ModelAttribute("game") Game game, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "game/formView";
        }
        
        gameService.setInstance(game);
        
        return "game/gameView";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String visit(@PathVariable("id") int id, Model model) {
        Game game = gameService.getInstance();
        
        game.visit(id);
        model.addAttribute("game", game);
        
        return "game/gameView";
    }
}
