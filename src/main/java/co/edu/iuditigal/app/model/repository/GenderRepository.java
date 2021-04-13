package co.edu.iuditigal.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iuditigal.app.model.entity.Gender;

public interface GenderRepository extends CrudRepository<Gender, Integer> {
	

}
