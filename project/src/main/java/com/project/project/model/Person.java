package com.project.project.model;
/**
 * {
 * id: 1,
 * name: "Andrea",
 * contractTypeName: "HourlySalaryEmployee",
 * roleId: 1,
 * roleName: "Administrator",
 * roleDescription: null,
 * hourlySalary: 10000,
 * monthlySalary: 50000
},
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String contractTypeName;
	private int roleId;
	private String roleName;
	private String roleDescription;
	private int hourlySalary;
	private int monthlySalary;
	private int result;

	public Person(int id, String name, String contractTypeName, 
	int roleId, String roleName, String roleDescription, int hourlySalary, int monthlySalary, int result) {
		super();
		this.id=id;
		this.name=name;
		this.contractTypeName=contractTypeName;
		this.roleId=roleId;
		this.roleName=roleName;
		this.roleDescription=roleDescription;
		this.hourlySalary=hourlySalary;
		this.monthlySalary=monthlySalary;
		this.result=result;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContractTypeName() {
		return this.contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public int getHourlySalary() {
		return this.hourlySalary;
	}

	public void setHourlySalary(int hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getMonthlySalary() {
		return this.monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public void setResult(int result) {
		this.result = result;
	}	

	/**
	 * 
	 * @return result
	 * ask if the contract type is Hour or Month in Lower case, later make the operations
	 */
	public int getResult(){
		if(getContractTypeName().equals(("Hourly Salary").toLowerCase())){
			result = 120 * hourlySalary * 12;
		}
		else if(getContractTypeName().equals(("Monthly Salary").toLowerCase())){
			result = monthlySalary * 12;
		}
		return result;
	}

	public Person() {
	}
	
}
