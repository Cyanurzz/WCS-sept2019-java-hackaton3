package com.wildcodeschool.hackaton3.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.wildcodeschool.hackaton3.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByName(String name);
}
