package com.victor01.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor01.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
