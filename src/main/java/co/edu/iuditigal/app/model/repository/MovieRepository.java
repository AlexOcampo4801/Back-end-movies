package co.edu.iuditigal.app.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iuditigal.app.model.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
