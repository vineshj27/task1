package com.account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.dao.AccountDao;
import com.account.entity.Accountholder;

@Service

public class AccountService {

	@Autowired
	AccountDao ad;

	public String setByone(Accountholder acg) {
		return ad.setByone(acg);
	}

	// Findall,toUpdate,Todelete
	public String setAll(List<Accountholder> cac) {
		return ad.setAll(cac);
	}

	public Accountholder findByid(int af) {
		return ad.findByid(af);
	}

	public List<Accountholder> Findall() {
		return ad.Findall( );
	}

	public String toUpdate(Accountholder ahol) {
		return ad.toUpdate(ahol);
	}

	public String Todelete(int ag) {
		return ad.Todelete(ag);
	}
}
