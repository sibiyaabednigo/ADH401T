package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ëmployee_tbl")
public class EmployeeEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
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
}
