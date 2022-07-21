package com.bridgelabz.gamblingsimulator;

public class Gambling {
	int stake = 100;
	static int dailybet = 1;
	public static void gambler() {
		int result = (int) Math.floor(Math.random() * 10 % 2);
		if(dailybet == result) {
			System.out.println("Winner");
		}else {
			System.out.println("loser");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Gambling Simulator Program");
		gambler();
	}

}