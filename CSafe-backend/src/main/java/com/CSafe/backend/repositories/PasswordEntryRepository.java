package com.CSafe.backend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.CSafe.backend.classes.PasswordEntry;

public interface PasswordEntryRepository extends CrudRepository <PasswordEntry, Integer> {
	
	@Query("SELECT passwordEntryObj FROM PasswordEntry passwordEntryObj WHERE passwordEntryObj.passwordEntryId=:passwordEntryId")
	PasswordEntry findPasswordEntryObjByPasswordEntryId(@Param("passwordEntryId") int passwordEntryId);
}
