package com.victor01.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor01.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
