/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;
import java.util.Set;

/**
 *
 * @author Richard Salac (richard.salac@datera.cz)
 */
public interface OwnerService extends CrudService<Owner, Long> {
    
    Owner findByLastName(String lastName);
    
}
