package com.machine.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.machine.CustomerService.ApplicationData;
import com.machine.model.Customer;


@RestController
public class CustomerServiceController {
	@Autowired
	private ApplicationData applicationData;
	
	@GetMapping("/service/customer")
	public  List<Customer> customerList() {
		List<Customer> customerList=applicationData.getCustomerAll();
		return customerList;
		
	}
	@PostMapping("/service/updateBalance")
	public void denominationSet(@RequestParam("requestAmount") long requestAmount,@RequestParam("cardNumber") String cardNumber){
		 applicationData.getCustomerAll().stream().filter(c -> c.getAtmCardNumber().equals(cardNumber)).findFirst().orElseThrow(NullPointerException::new).setBalance(requestAmount);
		
	}

}
