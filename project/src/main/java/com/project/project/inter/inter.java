package com.project.project.inter;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import com.project.project.model.Person;

@Repository
public interface inter extends CrudRepository <Person, Integer>{
    List<Person> findByName(String name);
    Optional<Person> findById(int id);
}
