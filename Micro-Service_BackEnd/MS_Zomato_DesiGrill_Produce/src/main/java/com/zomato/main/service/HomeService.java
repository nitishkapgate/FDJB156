package com.zomato.main.service;

import com.zomato.main.model.DesiGrill;

public interface HomeService 
{
	public DesiGrill insertdata(DesiGrill dg);

	public Iterable<DesiGrill> findalldata();

	public DesiGrill updatemenu(DesiGrill dg);

	public void deletedata(int id);

	
}
