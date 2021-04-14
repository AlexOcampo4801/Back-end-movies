package co.edu.iuditigal.app.service.iface;



import co.edu.iuditigal.app.model.entity.Users;

public interface UsersService {
 /**
  * Crear Nuevo usuario
  * @param users
  */
  public void create (Users users);
  /**
   * Loguea un usuario
   * @param users
   * @return
   * @throws Exception
   */
  public Users login (Users users) throws Exception;
  
}
