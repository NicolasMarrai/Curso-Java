package com.nicolasmarrai.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nicolasmarrai.workshopmongo.domain.User;
import com.nicolasmarrai.workshopmongo.repository.UserRespository;

@Service
public class UserService {
	
	@Autowired
	private UserRespository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
}