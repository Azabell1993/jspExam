package com.yangdoll.persistence;

import org.springframework.data.repository.CrudRepository;

import com.yangdoll.domain.Board;

public interface BoardRepository extends CrudRepository<Board, Long>{

}
