package com.zomato.main.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zomato.main.model.Menu;

@CrossOrigin("*")
@RestController

public class HomeController 
{
	@Autowired
	RestTemplate rt;
	
	@PostMapping("/send_data/{hotelname}")
	public Menu saveDetails(@RequestBody Menu mn, @PathVariable String hotelname)
	{
		if(hotelname.equalsIgnoreCase("Desigrillhotel"))
		{
			String url="http://zuul/dsgrl/Desigrillhotel/save_data";
			Menu dsgrl = rt.postForObject(url, mn , Menu.class);
			return dsgrl;
		}
		else if (hotelname.equalsIgnoreCase("Gardencourthotel")) 
		{
			String url="http://zuul/grdcrt/Gardencourthotel/save_data";
			Menu grdcrt = rt.postForObject(url, mn , Menu.class);
			return grdcrt;
		}
		
		return null;	
	}
	
	
	//If we want to iterate in multiple array then //
	
	
//	@GetMapping("/get_all_data")
//	public List<List<Menu>> getDetails()
//	{
//		
//		String url="http://localhost:9091/Desigrillhotel/get_data";
//		List<Menu> dsgrl = rt.getForObject(url, List.class);
//		
//		
//		String url1="http://localhost:9092/Gardencourthotel/get_data";
//		List<Menu> grdcrt = rt.getForObject(url1, List.class);
//		
//		
//		
//		List<List<Menu>> al=new ArrayList<>();
//		al.add(dsgrl);
//		al.add(grdcrt);
//		
//		
//		return al;
//	}
		

		//OR If we want to iterate in single array then//
	
	
		@GetMapping("/get_all_data/{order}")
		public List<Menu> getDetails(@PathVariable String order)
		{
		String url="http://zuul/dsgrl/Desigrillhotel/get_data";
		Menu[] dsgrl = rt.getForObject(url, Menu[].class);
		
		
		String url1="http://zuul/grdcrt/Gardencourthotel/get_data";
		Menu[] grdcrt = rt.getForObject(url1, Menu[].class);
		
		
		
		List<Menu> alllist=new ArrayList<>();
		for(Menu mn1:dsgrl)
		{
			alllist.add(mn1);
		}
		for(Menu mn2:grdcrt)
		{
			alllist.add(mn2);
		}
		
		
		List<Menu> collect = alllist.stream().filter(ad->ad.getName().equalsIgnoreCase(order)).collect(Collectors.toList());
		return collect;	
	}
		
		
		
		
		
}
