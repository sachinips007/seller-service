package com.edusol.org.seller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.edusol.org.seller.model.Seller;
@Repository
public interface SellerRepository extends JpaRepository<Seller, Integer> 
{

	//boolean existsByName(String name);

	

	boolean existsBysname(String name);

	void deleteBySname(String name);
	
	boolean existsByscity(String name); 
	
	String deleteByscity(String city);
	
	boolean existsBysemail(String email); 
	String deleteBysemail(String email);

	List<Seller> findAllBysname(String name);

	List<Seller> findAllByscity(String city);

	List<Seller> findAllBysemail(String email);

	

	

	//boolean existsByName(String name);

	//String deleteByName(String name);

	
	

}
