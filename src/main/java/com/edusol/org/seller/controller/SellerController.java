package com.edusol.org.seller.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edusol.org.seller.model.Seller;
import com.edusol.org.seller.service.SellerService;


@RestController
@RequestMapping("/seller")
public class SellerController {
@Autowired
	
	private SellerService sellerservice;
private final Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());
@PostMapping	
public ResponseEntity<String> create_seller(@RequestBody Seller seller) {
	logger.info("user added successfully");	
	return sellerservice.create_seller(seller);
	
	}
@GetMapping
public ResponseEntity<List<Seller>> get_seller() {
	return  sellerservice.get_seller();
	}
@RequestMapping("/findbyname")
public ResponseEntity<Seller> getByName(@RequestParam String name){
	return sellerservice.getByName(name);
	
}
@RequestMapping("/findbyid")
public ResponseEntity<Seller> getById(@RequestParam int id){
	return sellerservice.getById(id);
	
}

@RequestMapping("/findbycity")
public ResponseEntity<Seller> getByCity(@RequestParam String city){
	return sellerservice.getByCity(city);
	
}
@RequestMapping("/findbyemail")
public ResponseEntity<List<Seller>> getByEmail(@RequestParam String email){
	return sellerservice.getByEmail(email);
	
}
@PutMapping
public ResponseEntity<String> update_seller(Seller seller) {
	return sellerservice.update_seller(seller);
}

@DeleteMapping
public ResponseEntity<String> delete_seller(@RequestParam int id) {
	return sellerservice.delete_seller(id);
}
@RequestMapping("/deleten")
 public ResponseEntity<String> deleteByName(@RequestParam String name) {
 return sellerservice.deleteByName(name); 
 }
@RequestMapping("/deletec")
 public ResponseEntity<String> deleteByCity(@RequestParam String city) {
	 return sellerservice.deleteByCity(city);
 }
@RequestMapping("/deletee")
 public ResponseEntity<String> deleteByEmail(@RequestParam String email) {
	 return sellerservice.deleteByEmail(email);}
	 
	 //
	 @RequestMapping("/deleteem")
	 public ResponseEntity<String> deleteByemail(@RequestParam String email) {
		 //return sellerservice.deleteByEmail(email);
		 return null;
 }
}
