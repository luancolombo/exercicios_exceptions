package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account ac = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		double withdraw = sc.nextDouble();
		
		try {
		ac.withdraw(withdraw);
		System.out.printf("New balance: %.2f%n" ,  ac.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
		

	}

}
