package com.log.mask;

import java.util.Scanner;

public class LoanEMICalculator {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double principal, rate, emi;
		int time;
		
		System.out.println("Enter the principal amount: ");
		principal = s.nextDouble();
		
		System.out.println("Enter rate");
		rate = s.nextDouble();
		
		System.out.println("Enter time is year:");
		time = s.nextInt(); // time in year
		
		rate = rate / (12 * 100); // rate per month
		System.out.println("Rate: "+rate);
		
		time = time * 12; // time in month
		System.out.println("Time: "+time );
		System.out.println("-----------------------------------");
		
		double rateInAmount;
		double principalAmountInEmi;
		double principalRemaining;
		int countMonth = 1;
		
		for(int i=time; i>=1; i--)
		{
			//EMI = [P x R x (1+R)^N]/[(1+R)^N-1]
			emi = (principal * rate * Math.pow(1 + rate, i)) / (Math.pow(1 + rate, i) - 1);
			
			rateInAmount = rate * principal;
			principalAmountInEmi = emi - rateInAmount;
			principalRemaining = principal - principalAmountInEmi;
			principal = principalRemaining;
			
			System.out.println(countMonth+"st Month EMI: "+emi);
			System.out.println("Rate In Amount: "+rateInAmount);
			System.out.println("Principal Amount In Emi: "+principalAmountInEmi);
			System.out.println("Principal Remaining: "+Math.abs(principalRemaining));
			countMonth++;
			System.out.println("-----------------------------------");
		}
		
		s.close();
	}
}
