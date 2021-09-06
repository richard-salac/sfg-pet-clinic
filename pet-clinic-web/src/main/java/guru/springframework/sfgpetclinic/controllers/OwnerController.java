/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Richard Salac (richard.salac@datera.cz)
 */
@RequestMapping("/owners")
@Controller
public class OwnerController {
    
    @RequestMapping({"","/","/index","/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
