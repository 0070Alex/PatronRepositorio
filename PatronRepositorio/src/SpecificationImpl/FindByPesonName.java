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
public class FindByPesonName implements Specification<Person>{
    
    private String name;

    public FindByPesonName(String name) {
        this.name = name;
    }
    
    

    @Override
    public boolean isExitst(Person person) {
        return person.getName().equalsIgnoreCase(name);
    }
    
}
