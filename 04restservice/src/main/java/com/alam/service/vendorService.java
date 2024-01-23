package com.alam.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alam.entities.Vendor;

@Component
public class vendorService {
	
	//Internal Table
		HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();
		@Autowired
		Vendor x;
		@Autowired
		Vendor y;
		@Autowired
		Vendor z;
		
	public HashMap<String, Vendor> readAllVendors(){
		fillVendor();
		
		return vendors;
	}
	
	public Vendor getSingleVendorById(String vendorCode) {
		fillVendor();
		return (Vendor)vendors.get(vendorCode);
	}
	
	public Vendor createVendor(Vendor vendor) {
		return vendor;
		//validations.
		//Pre check;
		//DB Calls;
		// Post Validation
		//Formatting
	}
	
	public Vendor changeVendor(Vendor vendor) {
		return vendor;
	}
	
	private void fillVendor() {
		vendors.put("1", x);
		vendors.put("2", y);
		vendors.put("3", z);
		
	}

}
