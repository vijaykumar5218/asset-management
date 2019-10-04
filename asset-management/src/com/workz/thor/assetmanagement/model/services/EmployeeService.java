package com.workz.thor.assetmanagement.model.services;

import org.springframework.ui.ModelMap;

import com.workz.thor.assetmanagement.dto.EmployeeDTO;
import com.workz.thor.assetmanagement.entity.EmployeeEntity;

public interface EmployeeService {
	
	public EmployeeEntity verifyEmailAndPassword(EmployeeDTO dto,ModelMap map);

}
