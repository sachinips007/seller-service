package com.edusol.org.seller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SELLER_TABLE")
public class Seller {
	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	private String semail;
	private String scity;
	//private String Type;
	
	//<Passport Details>

	//<For Proprietorship>
	//private String passport_no;
	//private String passport_name;
	//private String GSTRegistration_no;
	//private String PANCard_no;
	//private String voter_id;
	//private String driving_license;

//<for Partenership>

	//private String partnership_registration_certificate_id;
	//private String rental_agreement_id;

//<For Private Limited Company>

	//private String certificate_of_incorporation_id;
	//private String company_pancard;
	//private String company_registration_no;
	//private String company_name;



public Seller() {
	super();
	// TODO Auto-generated constructor stub
}
	public Seller(int sid, String sname, String semail, String scity) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.scity = scity;
	}
	public int getSeller_id() {
		return sid;
	}
	public void setSeller_id(int sid) {
		this.sid = sid;
	}
	public String getSeller_name() {
		return sname;
	}
	public void setSeller_name(String sname) {
		this.sname = sname;
	}
	public String getSeller_email() {
		return semail;
	}
	public void setSeller_email(String semail) {
		this.semail = semail;
	}
	public String getSeller_address() {
		return scity;
	}
	public void setSeller_address(String scity) {
		this.scity = scity;
	}




}
