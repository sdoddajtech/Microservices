package com.sai.weblocation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sai.weblocation.entities.Weblocation;
import com.sai.weblocation.repos.WeblocationRepository;

@Service
public class WeblocationServiceImpl implements WeblocationService {
	
	@Autowired
	private WeblocationRepository repository;

	@Override
	public Weblocation saveWeblocation(Weblocation weblocation) {
		return repository.save(weblocation);
	}

	@Override
	public Weblocation updateWeblocation(Weblocation weblocation) {
		return repository.save(weblocation);
	}

	@Override
	public void deleteWeblocation(Weblocation weblocation) {
		repository.delete(weblocation);

	}

	/*@Override
	public Weblocation getWeblocationById(int id) {
		return repository.findOne(id);
		
	}*/

	@Override
	public List<Weblocation> getAllWeblocations() {
		return repository.findAll();
	}
	
	public WeblocationRepository getRepository() {
		return repository;
	}

	public void setRepository(WeblocationRepository repository) {
		this.repository = repository;
	}

}
