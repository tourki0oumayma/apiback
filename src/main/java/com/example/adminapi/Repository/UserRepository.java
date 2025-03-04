package com.example.adminapi.Repository;

import java.util.List;
import java.util.Optional;

import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.adminapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findAll();

	Optional<User> findById(int id);

	User save(User user);

	void deleteById(int id);

}
