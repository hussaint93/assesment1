package com.abc.entity;

import java.util.Date;
import java.util.Scanner;

public class ABCBank {
	private static SavingsAccount savings;
	private static CurrentAccount current;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type of account user want to open");
		String accType=sc.nextLine();
		//for assignment purpose default values are used we can make use of scanner to 
		//take the user input here .
		if(accType.equalsIgnoreCase("savings")){
			//System.out.println("give the balance");
			 savings= new SavingsAccount(10000L, "hussain", accType, new Date(), true);
		}else if(accType.equalsIgnoreCase("current")) {
			 current = new CurrentAccount(10000L, "hussain", accType, new Date(), true, 10000L);
		}
	}
}
