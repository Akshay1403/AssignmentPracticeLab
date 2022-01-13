package AssignmentSolutions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class EmailValidation {
	
	
		   public static boolean isValidEmail(String email) {
			   String regex = "^(.+)@(.+)$";
			 // to check the pattern
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();

		       
		   }

		   public static void main(String[] args) {
		       List<String> emails = new ArrayList<String>();
		       //Examples for checking valid email addresses
		       emails.add("akshay@example.com");
		       emails.add("akshay123@example.com");
		       emails.add("aks123ab@example.me.org");
		       //Examples for checking invalid email addresses
		       emails.add("akshay.example.com");
		       emails.add("aks.123aks@example.com");
		       emails.add("verify@.example.com");

		       for (String value : emails) {
		           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
		       }//printing the entered email is valid or not according to the user
		       
		       System.out.println("Enter any email address to check");
		       Scanner sc = new Scanner(System.in);//takes the email from the user
		       String input = sc.nextLine();
		       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));//printing the entered email is valid or not according to the user
		       
		   }
		   
}