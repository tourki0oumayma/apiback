package com.example.adminapi.Repository;

import java.util.List;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminapi.model.Ordonnance;

public interface OrdonnanceRepository extends JpaRepository<Ordonnance, Long> {


	Object findById(int id);

	List<Ordonnance> findAll();

	Ordonnance save(Ordonnance ordonnance);

}
