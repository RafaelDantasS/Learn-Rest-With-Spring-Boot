package com.studies.rest.services;

import com.studies.rest.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PeopleServices {

    private static final AtomicLong counter = new AtomicLong();
    private Logger logger= Logger.getLogger(PeopleServices.class.getName());

    public Person findById(String id){
        logger.info("finding one person");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Rafael");
        person.setLastName("Dantas");
        person.setAdress("Sao paulo");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll(){
        logger.info("finding all people");
        var persons = new ArrayList<Person>();
        for (int i = 0; i < 8; i++) {
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }
    public Person create(Person person) {

        logger.info("Creating one Person");

        return person;
    }

    public Person update(Person person) {

        logger.info("Updating one Person");

        return person;
    }

    public void delete(String id) {

        logger.info("Deleting one Person");

    }
    private Person mockPerson(int i) {
        Person person = new Person();
        person.setFirstName("FN" +i);
        person.setLastName("LN" + i);
        person.setAdress("Adress" + i);
        person.setGender("Gender" + i);
        return person;
    }
}
