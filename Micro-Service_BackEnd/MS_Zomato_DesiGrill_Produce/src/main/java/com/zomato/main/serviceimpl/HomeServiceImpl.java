package com.zomato.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zomato.main.model.DesiGrill;
import com.zomato.main.repository.HomeRepository;
import com.zomato.main.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService
{
	@Autowired
	HomeRepository hr;
	
	@Override
	public DesiGrill insertdata(DesiGrill dg)
	{  
		  return hr.save(dg);
	}

	@Override
	public Iterable<DesiGrill> findalldata() {
		
		return hr.findAll();
	}

	@Override
	public DesiGrill updatemenu(DesiGrill dg) 
	{
		
		return hr.save(dg);
	}

	@Override
	public void deletedata(int id) 
	{
		hr.deleteById(id);
		
	}
	
	

	
}
