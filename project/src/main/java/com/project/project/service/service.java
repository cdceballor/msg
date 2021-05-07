package com.project.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.project.inter.inter;
import com.project.project.interService.interfaceService;
import com.project.project.model.Person;

@Service
public class service implements interfaceService {
	@Autowired
	private inter data;

	@Override
	public List<Person> list() {
		return (List<Person>)data.findAll();
	}

	@Override
	public Optional<Person> listPersonById(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Person p) {
		int res=0;
		Person person = data.save(p);
		if(!person.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

	@Override
	public List<Person> buscarPorNombre(String name) {
		return (List<Person>)data.findByName(name);
	}
	
	@Override
	public List<Person> buscarPorId(int id){
		return (List<Person>)data.findById(id);
	}
}
