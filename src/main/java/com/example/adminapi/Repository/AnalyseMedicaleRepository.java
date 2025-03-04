package com.example.adminapi.Repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminapi.model.AnalyseMedicale;

public interface AnalyseMedicaleRepository extends JpaRepository<AnalyseMedicale, Long> {

	List<AnalyseMedicale> findAll();

	Optional<AnalyseMedicale> findById(Long id);

	AnalyseMedicale save(AnalyseMedicale analyse);

	void deleteById(Long id);





}
