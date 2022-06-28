package com.yangdoll.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor

public class Member {

	@Id
	private String id;
	private String password;
	private String name;
	private String role;
//	private String enable;
	
	
	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", role=" + role + "]";
	}
	
	
	
}
