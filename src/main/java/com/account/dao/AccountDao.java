package com.account.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.account.entity.Accountholder;
import com.account.repository.AccountRepository;

@Repository

public class AccountDao {
	// setByone,setAll,findByid,Findall,toUpdate,Todelte
	@Autowired

	AccountRepository ar;

	public String setByone(Accountholder aho) {
		ar.save(aho);
		return "saved one value";
	}

	public String setAll(List<Accountholder> acon) {
	 ar.saveAll(acon);
	return "saved all";
	}

	public Accountholder findByid(int id) {
		return ar.findById(id).get();
	}

	public List<Accountholder> Findall() {
		return ar.findAll();
	}

	public String toUpdate(Accountholder agh) {
		ar.save(agh);
		return "updated";
	}

	public String Todelete(int acl) {
		ar.deleteById(acl);
		return "deleted";
	}

}
