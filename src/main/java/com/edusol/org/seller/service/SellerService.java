package com.edusol.org.seller.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edusol.org.seller.model.Seller;
import com.edusol.org.seller.repository.SellerRepository;

import ch.qos.logback.classic.Logger;

@Service
@Transactional
public class SellerService {
	@Autowired
	SellerRepository sellerrepository;
	private org.slf4j.Logger logger =org.slf4j.LoggerFactory.getLogger(this.getClass()); 
	
	public ResponseEntity<String> create_seller(Seller seller) {
		// TODO Auto-generated method stub
		sellerrepository.save(seller);
		logger.info("User added succesfully : "+seller);
		return new ResponseEntity("Seller_Added_Successfully!",HttpStatus.OK);
	}
	public ResponseEntity<List<Seller>> get_seller() {
		// TODO Auto-generated method stub
		return new ResponseEntity<List<Seller>>(sellerrepository.findAll(),HttpStatus.OK);
		
	}
	public ResponseEntity <String> update_seller(Seller seller) {
		// TODO Auto-generated method stub
		
		sellerrepository.save(seller);
		
		return new ResponseEntity( "record updated successfully !",HttpStatus.OK);
	}

	
	 public ResponseEntity<String> delete_seller(int id) 
	 { // TODO Auto-generated method stub
	 
	 if (sellerrepository.existsById(id)) 
	 { 
	 sellerrepository.deleteById(id);
	 logger.info("User "+getById(id)+" Deleted successfully !");
	 return new ResponseEntity ("seller"+sellerrepository.findById(id)+"deleted Successfully !",HttpStatus.OK); 
	 }
	 else 
	 { 
		 logger.warn("Record for the given id is not found !");
		 return new ResponseEntity("Record for the given id is not found !",HttpStatus.NOT_FOUND); 
		 
	 } 
	 
	 }
	 
		  public ResponseEntity<String> deleteByName(String name) 
		  { 
			  // TODO Auto-generated method
		 
		 
		  if (sellerrepository.existsBysname(name)) 
		  {
			  
		  sellerrepository.deleteBySname(name);
		  logger.info("user deleted successfully !");
		  return new ResponseEntity("seller "+name+" deleted Successfully !",HttpStatus.OK); 
		  } 
		  else 
		  { 
			  logger.warn("User not found !");
			  return new ResponseEntity("Record not found !",HttpStatus.NOT_FOUND);
		   } 
		  
		  }
		  
		public ResponseEntity<String> deleteByCity(String city) {
			// TODO Auto-generated method stub
			if(sellerrepository.existsByscity(city)) {
			sellerrepository.deleteByscity(city);
			logger.info("seller deleted !");
			return new ResponseEntity("seller from city "+city+" deleted",HttpStatus.OK);
			}
			else {
				logger.error("city not found");
				return new ResponseEntity("city not found !",HttpStatus.NOT_FOUND);
			}
		}
		public ResponseEntity<String> deleteByEmail(String email) {
			// TODO Auto-generated method stub
			if(sellerrepository.existsBysemail(email)) {
			sellerrepository.deleteBysemail(email);
			logger.info("Seller has been deleted !");
			return new ResponseEntity("seller having "+email+" has been deleted !",HttpStatus.OK);
			}
			else 
			{
				logger.error(email);
				return new ResponseEntity("seller with email "+email+" not found !",HttpStatus.NOT_FOUND);
			}
		}
		public ResponseEntity<Seller> getByName(String name) {
			// TODO Auto-generated method stub
			
			
			
				return new ResponseEntity(sellerrepository.findAllBysname(name), HttpStatus.FOUND);
			
			
			}
		public ResponseEntity<Seller> getById(int id) {
			// TODO Auto-generated method stub
			return new ResponseEntity(sellerrepository.findById(id),HttpStatus.OK);
		}
		public ResponseEntity<Seller> getByCity(String city) {
			// TODO Auto-generated method stub
			return new ResponseEntity(sellerrepository.findAllByscity(city),HttpStatus.OK);
		}
		public ResponseEntity<List<Seller>> getByEmail(String email) {
			// TODO Auto-generated method stub
			return new ResponseEntity(sellerrepository.findAllBysemail(email),HttpStatus.OK);
		}
}
		 


	

