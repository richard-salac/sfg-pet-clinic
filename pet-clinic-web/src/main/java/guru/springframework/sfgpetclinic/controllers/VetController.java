/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Richard Salac (richard.salac@datera.cz)
 */
@Controller
public class VetController {
    
    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }
    
    @RequestMapping({"/vets","/vets/index","/vets/index.html","/vets.html"})
    public String listVets(Model model){
        
        model.addAttribute("vets", vetService.findAll());
        
        return "vets/index";
    }
}
