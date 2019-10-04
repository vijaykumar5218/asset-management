package com.workz.thor.assetmanagement.dto;

import java.io.Serializable;

public class EmployeeDTO implements Serializable{
	
	private int empId;
	private String empName;
	private String emplEmail;
	private String empPassword;
	private String empRole;
	private boolean empResetflag;
	private String empGenPassword;
	
	private String empNewPassword;
	private String empConfirmPassword;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmplEmail() {
		return emplEmail;
	}
	public void setEmplEmail(String emplEmail) {
		this.emplEmail = emplEmail;
	}
	public String getEmpPassword() {
		return empPassword;
	}
	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public boolean isEmpResetflag() {
		return empResetflag;
	}
	public void setEmpResetflag(boolean empResetflag) {
		this.empResetflag = empResetflag;
	}
	public String getEmpGenPassword() {
		return empGenPassword;
	}
	public void setEmpGenPassword(String empGenPassword) {
		this.empGenPassword = empGenPassword;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [empId=" + empId + ", empName=" + empName + ", emplEmail=" + emplEmail + ", empPassword="
				+ empPassword + ", empRole=" + empRole + ", empResetflag=" + empResetflag + ", empGenPassword="
				+ empGenPassword + "]";
	}
	

}
