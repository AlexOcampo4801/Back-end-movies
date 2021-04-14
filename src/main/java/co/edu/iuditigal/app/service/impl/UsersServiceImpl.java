package co.edu.iuditigal.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iuditigal.app.model.entity.Users;
import co.edu.iuditigal.app.model.repository.UsersRepository;
import co.edu.iuditigal.app.service.iface.UsersService;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public void create(Users users) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Users login(Users users) throws Exception {
		Users existsUsers = usersRepository.findByEmailAndPassword(users.getEmail(), users.getPassword());
		if(existsUsers == null) {
			throw new Exception("Usuario y/o contraseña invalida!");
		}
		return existsUsers;
	}
	
	
}
