package com.kodnest.tunehub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub.entity.Song;
import com.kodnest.tunehub.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	public User findByEmail(String email);

	public void save(Song song);



}
