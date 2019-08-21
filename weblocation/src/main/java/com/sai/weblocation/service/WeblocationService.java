package com.sai.weblocation.service;

import java.util.List;

import com.sai.weblocation.entities.Weblocation;

public interface WeblocationService {
	
	Weblocation saveWeblocation(Weblocation weblocation);

	Weblocation updateWeblocation(Weblocation weblocation);

	void deleteWeblocation(Weblocation weblocation);

	//Weblocation getWeblocationById(int id);

	List<Weblocation> getAllWeblocations();

}
