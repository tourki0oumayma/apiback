package com.example.adminapi.Repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminapi.model.Medecin;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {

	List<Medecin> findAll();

	Optional<Medecin> findById(int id);

	Medecin save(Medecin medecin);

	void deleteById(int id);
}
