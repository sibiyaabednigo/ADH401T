package model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="employee")
@SessionScoped

public class Employee {

	private String name;
	private String surName;
	private String SourcePassport;
	private String DestinationPassport;
	private String DestinationBank;
	private String DestationCountry;
	//private int AccountNumber;
	private double Amount;
	private int TransactionCode;
	private Date dateOfBirth;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getsurname() {
		return surName;
	}
	public void setsurname(String surName) {
		this.surName = surName;
	}
	
	public String getSourcePassport() {
		return SourcePassport;
	}
	public void setSourcePassport(String SourcePassport) {
		this.SourcePassport = SourcePassport;
	}
	
	public String getDestinationPassport() {
		return DestinationPassport;
	}
	public void setDestinationPassport(String DestinationPassport) {
		this.DestinationPassport = DestinationPassport;
	}
	
	public String getDestinationBank() {
		return DestinationBank;
	}
	public void setDestinationBank(String DestinationBank) {
		this.DestinationBank = DestinationBank;
	}
	
	public String getDestationCountry() {
		return DestationCountry;
	}
	public void setDestationCountry(String DestationCountry) {
		this.DestationCountry = DestationCountry;
	}
	
	/*public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int AccountNumber) {
		this.AccountNumber = AccountNumber;
	}*/
	
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	
	public int getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(int TransactionCode) {
		this.TransactionCode = TransactionCode;
	}
	
	public Date getdateOfBirth() {
		return dateOfBirth;
	}
	public void setdateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	 
	public EmployeeEntity getEntity()
	{
		EmployeeEntity employeeentity = new EmployeeEntity();
		employeeentity.setName(name);
		employeeentity.setsurname(surName);
		employeeentity.setSourcePassport(SourcePassport);
		employeeentity.setDestinationPassport(DestinationPassport);
		employeeentity.setDestinationBank(DestinationBank);
		employeeentity.setDestationCountry(DestationCountry);
		employeeentity.setAmount(Amount);
		employeeentity.setTransactionCode(TransactionCode);
		
		return employeeentity;
	}
	
}
