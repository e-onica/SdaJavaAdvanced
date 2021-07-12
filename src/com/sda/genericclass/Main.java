package com.sda.genericclass;

import com.sda.genericclass.model.Person;
import com.sda.genericclass.repository.IdentifiableRepository;

public class Main {

    public static void main(String[] args){
        IdentifiableRepository<Person> personRepository = new IdentifiableRepository<>();
        Person person = new Person();
        person.setCNP("290011111111111");
        person.setName("Richard");
        personRepository.addItem(person);
        System.out.println(personRepository.getItemById("23"));
        System.out.println(personRepository.getItemById("290011111111111"));
        personRepository.removeItemById("290011111111111");
        System.out.println(personRepository.getItemById("290011111111111"));
    }
}
