package co.edu.iuditigal.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iuditigal.app.model.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

}
