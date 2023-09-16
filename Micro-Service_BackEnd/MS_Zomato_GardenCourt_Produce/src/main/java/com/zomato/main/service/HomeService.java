package com.zomato.main.service;

import java.util.List;


import com.zomato.main.model.GardenCourt;

public interface HomeService 
{
	public GardenCourt insertdata(GardenCourt gc);

	public Iterable<GardenCourt> findalldata();

	public GardenCourt updatemenu(GardenCourt dg);

	public void deletedata(int id);

	
}
