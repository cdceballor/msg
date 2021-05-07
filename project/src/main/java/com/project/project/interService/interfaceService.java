package com.project.project.interService;
import java.util.List;
import java.util.Optional;
import com.project.project.model.Person;

public interface interfaceService {
	public List<Person> list();
	public Optional<Person>listPersonById(int id);
	public int save(Person person);
	public void delete(int id);
	public List<Person> buscarPorNombre(String name);
	public List<Person> buscarPorId(int id);
}

