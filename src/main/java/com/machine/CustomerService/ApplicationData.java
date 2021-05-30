package com.machine.CustomerService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.machine.model.Customer;


@Component
public class ApplicationData {

	private static List<Customer> customerAll = null;
	
	public  List<Customer> getCustomerAll() {
		
		if (customerAll == null) {
			customerAll = new ArrayList<Customer>();
			customerAll.add(new Customer("1234567890123456", 1234, 800));
			customerAll.add(new Customer("9876543210123456", 4321, 1230));
		}
		return customerAll;
	}
	

}
