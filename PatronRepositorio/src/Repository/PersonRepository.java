/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;

import Repository.Repository;
import specification.Specification;
import entity.Person;
import Storage.PersonStorage;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Alexander Elias
 */
public class PersonRepository implements Repository<Person>{
    
    private List<Person> storage;
    
    public PersonRepository(){
        storage = PersonStorage.getInstance().getPersonList();
    }

    @Override
    public void add(Person person) {
        storage.add(person);
    }

    @Override
    public List<Person> getAll() {
        return storage;
    }

    @Override
    public List<Person> findBySpecification(Specification specification) {
        List<Person> personList = new ArrayList<>();
        storage.stream().filter((person) -> (specification.isExitst(person))).forEachOrdered((person) -> {
            personList.add(person);
        });
        
        return personList;
    }

    @Override
    public void update(Person oldPerson, Person newPerson) {
        if (storage.contains(oldPerson)) {
            int oldPersonIndex = storage.indexOf(oldPerson);
            storage.set(oldPersonIndex, newPerson);
        }else{
            System.err.println("This Person is not in the Storage");
        }
    }

    @Override
    public void remove(long id) {
        for(Person person: storage){
            if (person.getId() == id) {
                storage.remove(person);
                break;
            }
        }
    }
    
}
