package co.edu.iuditigal.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iuditigal.app.model.entity.Gender;
import co.edu.iuditigal.app.model.repository.GenderRepository;
import co.edu.iuditigal.app.service.iface.GenderService;

@Service
public class GenderServiceimpl implements GenderService {
	
	@Autowired
	private GenderRepository genderRepository;

	@Override
	public List<Gender> getAll() {
		// TODO Auto-generated method stub
		List<Gender> genders = new ArrayList<>();
		genders = (List<Gender>) genderRepository.findAll();
		return genders;
	}

}
