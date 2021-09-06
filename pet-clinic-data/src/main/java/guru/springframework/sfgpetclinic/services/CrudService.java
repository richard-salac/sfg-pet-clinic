/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 *
 * @author Richard Salac (richard.salac@datera.cz)
 */
public interface CrudService<T, ID> {
    
    Set<T> findAll();
    
    T findById(ID id);
    
    T save(T object);
    
    void delete(T object);
    
    void deleteById(ID id);
}
