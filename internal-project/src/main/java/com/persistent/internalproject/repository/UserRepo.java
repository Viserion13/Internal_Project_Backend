package com.persistent.internalproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persistent.internalproject.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	public User findByEmailAndPassword(String email,String password);
	public User findByEmail(String email);
	public Optional<String> findByToken(String token);
}
