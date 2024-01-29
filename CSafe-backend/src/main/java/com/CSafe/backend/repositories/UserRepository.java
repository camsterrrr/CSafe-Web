package com.CSafe.backend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.CSafe.backend.classes.User;

public interface UserRepository extends CrudRepository <User, Integer> {
	
	@Query("SELECT userObj FROM User userObj WHERE userObj.userId=:userId")
	User findUserObjByUserId(@Param("userId") int userId);
	
	@Query("SELECT userObj FROM User userObj WHERE userObj.username=:username")
	User findUserObjByUsername(@Param("username") String username);
}
