
package com.project.project.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.project.interService.interfaceService;
import com.project.project.model.Person;

//@RestController
@Controller
@RequestMapping
public class HomeController {
	@Autowired
	private interfaceService service;

	@GetMapping("/")
	public String begin(){
		return "index";
	}

	/**
	 * @param model
	 * @return
	 * Address: (/product)
	 * Give all the data in a list
	 */
	@GetMapping("/product")
	public String list(Model model){
		List<Person>people=service.list();
		model.addAttribute("people",people);
		return "product";
	}
	/**
	 * 
	 * @param model
	 * @return
	 * Address:(/new)
	 * Create a new form
	 */
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("person", new Person());
		return "form";
	}
	@PostMapping("/save")
	public String save(@Validated Person p, Model model) {
		service.save(p);
		return "redirect:/product";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model model) {
		Optional<Person>person = service.listPersonById(id);
		model.addAttribute("person", person);
		return "form";
	}

	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id, Model model) {
		service.delete(id);
		return "redirect:/product";
	}

	@GetMapping("/listPeople")
	public String buscarPorNombre(@RequestParam String name, Model model, @ModelAttribute("people") Person person) {
		model.addAttribute("people", service.buscarPorNombre(name));
		return "product";
	}
	/**
	 * 
	 * @param id
	 * @param model
	 * @param person
	 * @return
	 * Search by id
	 * Call a person by id and give the information about that person
	 */
	@GetMapping("/listPeopleWithId/{id}")
	public String buscarPorId(@RequestParam int id, Model model, @ModelAttribute("people") Person person) {
		model.addAttribute("people", service.buscarPorId(id));
		return "product";
	}
}