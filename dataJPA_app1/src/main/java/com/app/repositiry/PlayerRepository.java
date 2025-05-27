package com.app.repositiry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Player;

//@Repository
public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
