package AssignmentSolutions;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);//take the input from user
		System.out.println("eneter the two numbers");
		int firstnum=sc.nextInt();//take the first number from the user
		int secnum= sc.nextInt();// take the second number from the user
		System.out.println("Enter the operator ");
		char op=sc.next().charAt(0);
		double Ans=0;
		// For doing the Calculations
		switch(op){
		case '+': Ans=firstnum+secnum;
		break;
		case '-':Ans=firstnum-secnum;
		break;
		case '*': Ans=firstnum*secnum;
		break;
		case '/':Ans=firstnum/secnum;
		break;
		}
		System.out.println("the answer is " +Ans);//Prints the Solution
	}
}