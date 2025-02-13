package com.ifyq.strokeprediction.patients;

import java.util.UUID;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientRepository extends ListCrudRepository<Patient, UUID> {
    //@Query("SELECT p FROM Patient p WHERE p.age > :age")
   // List<Patient> findByAgeGreaterThan(@Param("age") int age);
}

    



