package com.sai.weblocation.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sai.weblocation.entities.Weblocation;
import com.sai.weblocation.repos.WeblocationRepository;

@RestController
@RequestMapping("/weblocations")
public class WeblocationRestController {

	@Autowired
	WeblocationRepository weblocationRepository;

	@GetMapping
	public List<Weblocation> getWeblocations() {
		return weblocationRepository.findAll();

	}

	@PostMapping
	public Weblocation createWeblocation(@RequestBody Weblocation weblocation) {
		return weblocationRepository.save(weblocation);
	}

	@PutMapping
	public Weblocation updateWeblocation(@RequestBody Weblocation weblocation) {
		return weblocationRepository.save(weblocation);

	}

	/*@DeleteMapping("/{id}")
	public void deleteWeblocation(@PathVariable("id") int id) {
		weblocationRepository.delete(id);
	}
	
	@GetMapping("/{id}")
	public Weblocation getWeblocation(@PathVariable("id") int id) {
		return weblocationRepository.findOne(id);
		
	}*/
}
