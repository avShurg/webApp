package ru.avshurg.webApp.db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.avshurg.webApp.db.entities.Person;

public interface personRepository extends JpaRepository<Person, Long> {
}
