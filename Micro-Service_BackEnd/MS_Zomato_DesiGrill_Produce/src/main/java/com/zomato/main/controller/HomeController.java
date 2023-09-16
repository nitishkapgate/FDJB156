package com.zomato.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.zomato.main.model.DesiGrill;
import com.zomato.main.service.HomeService;

@RestController
@RequestMapping("/Desigrillhotel")
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	@PostMapping("/save_data")
	public DesiGrill saveDetail(@RequestBody DesiGrill dg)
	{
		
		
		DesiGrill insertdata = hs.insertdata(dg);
		return insertdata;
	}
	
	@GetMapping("/get_data")
	public List<DesiGrill> alldata()
	{
		Iterable<DesiGrill> findalldata = hs.findalldata();
		System.out.println(findalldata);
		
		
		return (List<DesiGrill>) findalldata;		
	}
	
	

}
