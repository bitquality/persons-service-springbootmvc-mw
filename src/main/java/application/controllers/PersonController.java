package application.controllers;

import java.util.List;

import application.entities.Person;
import org.springframework.web.bind.annotation.*;
import application.repositories.PersonRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4301")
@RequestMapping("/api/persons/v1")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping(value = "/all", produces = "application/json")
    public List<Person> getPersons() {
        return (List<Person>) personRepository.findAll();
    }

    @PostMapping(value="/add",consumes = "application/json", produces = "application/json")
    void addPerson(@RequestBody Person person) {
        personRepository.save(person);
        // { "firstName": "Gopi","lastName": "Mullapudi" }
    }

}