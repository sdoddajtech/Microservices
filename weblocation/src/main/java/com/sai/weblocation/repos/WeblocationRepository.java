package com.sai.weblocation.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sai.weblocation.entities.Weblocation;

public interface WeblocationRepository extends JpaRepository<Weblocation, Integer> {

	@Query("select type,count(type) from Weblocation group by type")
	public List<Object[]> findTypeAndTypeCount();
}
