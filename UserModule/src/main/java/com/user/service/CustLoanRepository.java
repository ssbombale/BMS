package com.user.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.user.entity.CustomeLoanApply;
import com.user.entity.User;

public interface CustLoanRepository extends JpaRepository <CustomeLoanApply, Integer>{

	CustomeLoanApply save(CustomeLoanApply user);

	List<CustomeLoanApply> findBycustId(Integer custId);
	

}
