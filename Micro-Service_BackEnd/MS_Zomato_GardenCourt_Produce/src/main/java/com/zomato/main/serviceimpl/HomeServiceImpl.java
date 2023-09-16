package com.zomato.main.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zomato.main.model.GardenCourt;
import com.zomato.main.repository.HomeRepository;
import com.zomato.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public GardenCourt insertdata(GardenCourt gc)
	{ 
		  return hr.save(gc);
	}

	@Override
	public Iterable<GardenCourt> findalldata() {
		
		return hr.findAll();
	}

	@Override
	public GardenCourt updatemenu(GardenCourt dg) {
		
		return hr.save(dg);
	}

	@Override
	public void deletedata(int id) {
		hr.deleteById(id);
		
	}

	
}
