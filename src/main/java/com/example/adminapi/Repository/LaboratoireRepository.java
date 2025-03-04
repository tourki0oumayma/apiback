package com.example.adminapi.Repository;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminapi.model.Laboratoire;

public interface LaboratoireRepository extends JpaRepository<Laboratoire, Long> {

	Laboratoire save(Laboratoire laboratoire);

}
