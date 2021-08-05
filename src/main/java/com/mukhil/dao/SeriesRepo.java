package com.mukhil.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mukhil.model.WebSeries;

@Repository
public interface SeriesRepo extends JpaRepository<WebSeries, Integer> {

	Optional<WebSeries> findByName(String name);
	
}
