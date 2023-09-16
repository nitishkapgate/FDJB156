package com.zomato.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GardenCourt 
{
	@Id
	private int id;
	
	private String hotel;
	private String name;
	private int price;
	private int deltime;
	
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDeltime() {
		return deltime;
	}
	public void setDeltime(int deltime) {
		this.deltime = deltime;
	}
	
	


}
