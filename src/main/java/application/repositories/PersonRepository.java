package application.repositories;

import application.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.*;


@Repository
public interface PersonRepository extends CrudRepository<Person, Long>{}