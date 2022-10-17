// Write a program to convert binary to decimal and decimal to binary

import java.util.Scanner;

public class Bi_and_Dec {
	public static void main(String args[]){
		// create object of input class
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your choice \n 1)Binary to Decimal \n 2)Decimal to Binary");
		int ch = input.nextInt();
		int sum = 0 , i = 0 , rem, n;
		switch(ch) {
		case 1:
		System.out.println("Enter Binary no :");
		int bi = input.nextInt();
		
		do{
                   rem = bi % 10;
                   sum += rem * Math.pow(2,i);
                   bi = bi / 10;
                   i++;
               }while(bi > 0);
		System.out.println("Decimal no:" + sum);
		break;
		case 2:
		System.out.println("Enter Decimal no :");
		n = input.nextInt();
		do{
                    rem = n % 2;
                    sum += rem * Math.pow(10,i);
                    n = n / 2;
                    i++;
                }while(n > 0); 
		System.out.println("Binary no:" + sum);
		break;
		default :
		System.out.println("Enter valid choice.");
		break;
		}
	}
}