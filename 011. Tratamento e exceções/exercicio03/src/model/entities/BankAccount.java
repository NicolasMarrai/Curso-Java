package model.entities;

import exceptions.TransferException;

public class BankAccount {
	
	private Integer number;
	private String holder;
	private Double balance;
	
	public BankAccount(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	public void transfer(Double amount, BankAccount target) {
		if(amount <= 0) {
			throw new TransferException("Amount must be positive");
		}
		if(amount > balance) {
			throw new TransferException("Insufficient balance for transfer");
		}
		balance -= amount;
		target.deposit(amount);
	}
	
	@Override
	public String toString() {
		return "Account " + number + " (" + holder + "): $ " + String.format("%.2f", balance);
	}

}
