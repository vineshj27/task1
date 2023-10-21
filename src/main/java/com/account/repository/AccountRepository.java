package com.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.entity.Accountholder;

public interface AccountRepository extends JpaRepository<Accountholder, Integer> {
	

}
