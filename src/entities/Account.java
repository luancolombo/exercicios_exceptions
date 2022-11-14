package entities;

import exceptions.BusinessException;


public class Account {
		private int number;
		private String holder;
		private double balance;
		private double withdrawLimit;
		
		public Account() {
		}

		public Account(int number, String holder, double balance, double withdrawLimit) {
			this.number = number;
			this.holder = holder;
			this.balance = balance;
			this.withdrawLimit = withdrawLimit;
		}
		
		public void deposit(double amount) {
			this.balance += amount;
		}
		
		public void withdraw(double amount) {
				this.validateWithdraw(amount);
				this.balance -= amount;

		}
		
		private void validateWithdraw(double amount) {
			if (amount > this.getWithdrawLimit()) {
				throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
			}
			if (amount > this.getBalance()) {
				throw new BusinessException("Withdraw error: Not enough balance");
			}
			
					
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public String getHolder() {
			return holder;
		}

		public void setHolder(String holder) {
			this.holder = holder;
		}

		public double getBalance() {
			return balance;
		}


		public double getWithdrawLimit() {
			return withdrawLimit;
		}

		public void setWithdrawLimit(double withdrawLimit) {
			this.withdrawLimit = withdrawLimit;
		}

		
		
		
		
		
		
		
}
