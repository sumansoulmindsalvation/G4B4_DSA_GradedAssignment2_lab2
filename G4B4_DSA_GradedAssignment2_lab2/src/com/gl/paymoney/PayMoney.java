package com.gl.paymoney;

import java.util.Scanner;

public class PayMoney {

		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the size of transaction array");
			int size = s.nextInt();
			int transactionArray[] = new int[size];

			System.out.println("enter the values of transaction5");
			for (int i = 0; i < size; i++)
				transactionArray[i] = s.nextInt();

			System.out.println("enter the total no of targets that needs to be achieved");
			int targetNo = s.nextInt();
			while (targetNo-- != 0) {
				int flag = 0;
				long target;

				System.out.println("enter the value of target");
				target = s.nextInt();
				long sum = 0;
				for (int i = 0; i < size; i++) {
					sum += transactionArray[i];
					if (sum >= target) {
						System.out.println("Target achieved after " + (i + 1) + " transactions ");
						flag = 1;
						break;

					}
				}
				if (flag == 0) {
					System.out.println(" Given target is not achieved ");
				}
			}
		}
	}
