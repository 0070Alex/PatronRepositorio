/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SpecificationImpl;

import entity.Person;
import specification.Specification;

/**
 *
 * @author Alexander Elias
 */
public class FindByPersonId implements Specification<Person>{
    
    private long userId;
    
    public FindByPersonId(long userId){
        this.userId = userId;
    }

    @Override
    public boolean isExitst(Person person) {
        return person.getId() == userId;
    }
    
    
    
}
