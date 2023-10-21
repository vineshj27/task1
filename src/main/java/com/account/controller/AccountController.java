package com.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.entity.Accountholder;
import com.account.service.AccountService;

@RestController

public class AccountController {

	@Autowired

	AccountService as;

	@PostMapping(path = "/one")
	public String setByone(@RequestBody Accountholder ah) {
		return as.setByone(ah);
	}

	@PostMapping(path = "/setall")
	public String setAll(@RequestBody List<Accountholder> ach) {
		return as.setAll(ach);
	}
	
	@GetMapping(path="/findone/{a}")
		public Accountholder findByid(@PathVariable int a) {
			return as.findByid(a);
		}
	@GetMapping(path="/findall")

	public List<Accountholder> Findall() {
		return as.Findall();
	}
	
	@PutMapping(path="/update")
	public String toUpdate(@RequestBody Accountholder acch) {
		return as.toUpdate(acch);
	}
	
	@DeleteMapping(path="/delete/{del}")
	public String Todelete(@PathVariable int del) {
		return as.Todelete(del);
	}
	
	
	
	
	

}
