/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Storage;

import entity.Person;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Elias
 */
public class PersonStorage {
    
    private List<Person> personList;
    
    private static PersonStorage instance = new PersonStorage();
    
    private PersonStorage(){
        personList = new ArrayList<>();
    }
    
    public static PersonStorage getInstance(){
        return instance;
    }
    
    public PersonStorage(List<Person> personList){
        this.personList = personList;
    }
    
    public List<Person> getPersonList(){
        return personList;
    }
    
}
