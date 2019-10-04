package com.workz.thor.assetmanagement.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Repository;

@Repository
@Entity
@Table(name = "asset_management_employee")
@NamedQueries({
		@NamedQuery(name = "findByEmailAndPassword", 
				query = "FROM EmployeeEntity emp where emp.emplEmail=:eMail and emp.empPassword=:pwd")

})
public class EmployeeEntity implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "e_id")
	private int e_id;
	@Column(name = "employee_id")
	private int empId;
	@Column(name = "employee_name")
	private String empName;
	@Column(name = "employee_email")
	private String emplEmail;
	@Column(name = "employee_password")
	private String empPassword;
	@Column(name = "employee_role")
	private String empRole;
	@Column(name = "employee_resetflag")
	private boolean empResetflag;
	@Column(name = "employee_generatedPassword")
	private String empGenPassword;

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
		return "EmployeeEntity [e_id=" + e_id + ", empId=" + empId + ", empName=" + empName + ", emplEmail=" + emplEmail
				+ ", empPassword=" + empPassword + ", empRole=" + empRole + ", empResetflag=" + empResetflag
				+ ", empGenPassword=" + empGenPassword + "]";
	}

}
