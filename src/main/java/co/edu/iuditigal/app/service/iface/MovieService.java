package co.edu.iuditigal.app.service.iface;

import java.util.List;

import co.edu.iuditigal.app.model.entity.Movie;

public interface MovieService {
	/**
	 * obtener todas la películas
	 * @return
	 */
	public List<Movie> getAll();
	
	/**
	 * Crea una película
	 * @param movie
	 */
	
	public void create(Movie movie);
	
	/**
	 * Edita un película por su Id
	 * @param movie
	 * @param movieId
	 */
	public void edit (Movie movie, int movieId);
	
	/**
	 * Borra una película por su Id
	 * @param movieId
	 */
	public void delete(int movieId);
	
	/**
	 * Califica una película
	 * @param movie
	 * @param movieId
	 */
	public void rate(Movie movie, int movieId);
	

}
