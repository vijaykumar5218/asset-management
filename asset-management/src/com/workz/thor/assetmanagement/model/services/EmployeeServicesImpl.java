package com.workz.thor.assetmanagement.model.services;

import javax.persistence.Entity;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;

import com.workz.thor.assetmanagement.dto.EmployeeDTO;
import com.workz.thor.assetmanagement.entity.EmployeeEntity;
import com.workz.thor.assetmanagement.model.dao.EmployeeDAO;

@Service
public class EmployeeServicesImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO dao;

	EmployeeEntity entity=null;
	@Override
	public EmployeeEntity verifyEmailAndPassword(EmployeeDTO dto, ModelMap map) {
		
		boolean validation = false;

		System.out.println("Dto in service layer is :"+dto);
		if (!StringUtils.isEmpty(dto.getEmplEmail())) {
			
			System.out.println("Email is valid..");
			validation = true;
		} else {
			
			System.out.println("Email is Invalid..");
//			return "Email is required !!";

		}
		if (!StringUtils.isEmpty(dto.getEmpPassword())) {
			System.out.println("Valid Password entered");
			validation = true;
		} else {
			
			System.out.println("password is Invalid..");
//			return "password are required!!";

		}
		
		if (validation) {
			System.out.println("Valid data so we can fetch from DB");
		
		      entity=dao.verifyEmailAndPassword(dto);
		      return entity;
		}
		if (!validation)
			return entity;
		
		return null;
		
		
	}

}
