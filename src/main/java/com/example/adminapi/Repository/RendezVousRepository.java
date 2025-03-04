package com.example.adminapi.Repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminapi.model.RendezVous;

public interface RendezVousRepository extends JpaRepository<RendezVous, Long> {

	List<RendezVous> findAll();

	Optional<RendezVous> findById(Long id);

	RendezVous save(RendezVous rendezVous);

	void deleteById(Long id);

}
