package com.yangdoll.persistence;

import org.springframework.data.repository.CrudRepository;

import com.yangdoll.domain.Member;

public interface MemberRepository extends CrudRepository<Member, String>{
	
}
