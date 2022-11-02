package patikaOdevRecursiveUsAlma;

import java.util.Scanner;

public class App {
	
	public static int exponent(int baseNumber, int exponentNumber) {
		
		// her sayinin 0. kuvveti 1'e esittir.
		if(exponentNumber == 0) {
			return 1;
		}
		// 1 sayisinin butun kuvvetleri 1'e esittir
		else if(baseNumber == 1) {
			return 1;
		}
		else {
			return baseNumber*exponent(baseNumber, exponentNumber-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter number: ");
		int baseNumber = sc.nextInt();
		System.out.print("Please enter exponent number: ");
		int exponentNumber = sc.nextInt();
		System.out.println("result: " + exponent(baseNumber,exponentNumber));
		
	}

}
