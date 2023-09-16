package com.zomato.main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.zomato.main.model.DesiGrill;

@Repository
public interface HomeRepository extends CrudRepository<DesiGrill, Integer> 
{
	

}
