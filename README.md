//# JAVA_CODES
//Here you will find some great codes!!!!!!!!!!!!!!!!!
//This codes helps to validate weather a mobile number is correct or not---------------------------
import java.util.regex.*;
import java.util.Scanner;
public class valid_mobile_no {
	public static boolean isValidMobileNumber(String s) {
		Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
		Matcher m=p.matcher(s);
		while(m.find() && m.group().equals(s)) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// PASS MOBILE NUMBER AS  STRING ---------------------------------
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE MOBILE NUMBER : ");
		String s=sc.next();
		if(isValidMobileNumber(s)) {
			System.out.println(s+" is a valid mobile no.");
		}
		else {
			System.out.println(" NOT A  valid mobile no.");
		}

	}

}
