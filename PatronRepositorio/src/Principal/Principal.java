/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import SpecificationImpl.FindByPesonName;
import SpecificationImpl.FindByPersonId;
import Repository.PersonRepository;
import entity.Person;
import Storage.PersonStorage;
import java.util.List;

/**
 *
 * @author Alexander Elias
 */
public class Principal {

    public static void main(String[] args) {

        PersonRepository repository = new PersonRepository();

        Person person1 = new Person(1, "Persona1", 24, "cicy1", "email1", "job1", "M", false);
        Person person2 = new Person(2, "Persona2", 22, "cicy2", "email2", "job2", "M", false);
        Person person3 = new Person(3, "Persona3", 21, "cicy3", "email3", "job3", "M", false);
        Person person4 = new Person(4, "Persona4", 19, "cicy4", "email4", "job4", "M", false);
        Person person5 = new Person(5, "Persona5", 35, "cicy5", "email5", "job5", "M", false);

        repository.add(person1);
        repository.add(person2);
        repository.add(person3);
        repository.add(person4);
        repository.add(person5);
        
        System.out.println("============================= Getting Person list from the storage ==================");
        List<Person> personList = repository.getAll();
        
        personList.forEach((p) -> {
            System.out.println(p);
        });
                 
        System.out.println("========================= FindByPersonName Specification ======================");
        
        String name = "Persona4";        
        List<Person> findByPersonName = repository.findBySpecification(new FindByPesonName(name));        
        findByPersonName.forEach((p) -> {
            System.out.println(p);
        });
        
        System.out.println("========================= FindByPersonId Specification ======================");
        
        int id = 5;        
        List<Person> findByPersonId = repository.findBySpecification(new FindByPersonId(id));        
        findByPersonId.forEach((p) -> {
            System.out.println(p);
        });
        
        
        System.out.println("========================= Update Old Person with a new onw ======================");
        
        Person person6 = new Person(6, "Persona6", 38, "cicy6", "email6", "job6", "F", true);
        repository.update(person5, person6);
        int indexOfUpdateObject = PersonStorage.getInstance().getPersonList().indexOf(person6);
        
        System.out.println(PersonStorage.getInstance().getPersonList().get(indexOfUpdateObject).getName());
        
        
        System.out.println("========================= remove Person from the List ======================");
        
        repository.remove(2);
        List<Person> personListAfterRemovingPerson = repository.getAll();
        
        personListAfterRemovingPerson.forEach(System.out::println);
    }

}
