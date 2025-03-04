package com.example.adminapi.Repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.adminapi.model.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

	List<Admin> findAll();

	Optional<Admin> findById(int id);

	Admin save(Admin admin);

	void deleteById(int id);

}
