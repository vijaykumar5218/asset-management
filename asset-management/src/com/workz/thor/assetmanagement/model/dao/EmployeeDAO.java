package com.workz.thor.assetmanagement.model.dao;

import com.workz.thor.assetmanagement.dto.EmployeeDTO;
import com.workz.thor.assetmanagement.entity.EmployeeEntity;

public interface EmployeeDAO {
	
	public EmployeeEntity verifyEmailAndPassword(EmployeeDTO dto);

}
