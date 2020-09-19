package com.rahul.bean;

public class Employee {

	private String eid;
	private String ename;
	private String eaddress;

	// Injecting a account bean into employee bean(Setter Injection)
	private Account account;

	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	//Method to display emp details and account details
	public void displayDetails() {

		System.out.println("Employee Details are");
		System.out.println("Eid is             :" + eid);
		System.out.println("Ename is           :" + ename);
		System.out.println("Eaddress is        :" + eaddress);
		System.out.println("---------------------------------------------------");
		System.out.println("Account information is ");
		System.out.println("AccNo is           :" + account.getAccNo());
		System.out.println("AccName is         :" + account.getAccName());
		System.out.println("AccType is         :" + account.getAccType());
		System.out.println("Balance is         :" + account.getBalance());
	}

}
