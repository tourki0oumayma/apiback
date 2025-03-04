package com.example.adminapi.Repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminapi.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	List<Patient> findAll();

	Optional<Patient> findById(int id);

	Patient save(Patient patient);

}
