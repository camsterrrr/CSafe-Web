package com.CSafe.backend.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.CSafe.backend.classes.Timestamp;

public interface TimestampRepository extends CrudRepository <Timestamp, Integer> {
	
	@Query("SELECT timestampObj FROM Timestamp timestampObj WHERE timestampObj.timestampId=:timestampId")
	Timestamp findTimestampObjByTimestampId(@Param("timestampId") int timestampId);
}
