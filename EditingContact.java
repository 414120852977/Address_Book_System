package Address;

import java.util.Scanner;


public class EditingContact {
	
	
	public void Edit(String name,String last,String address,String state,long phoneno,String email){
		 
		System.out.println("enter your first name :");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		System.out.println("Enter your last name :");
		String l = sc.nextLine();
		System.out.println("Enter your address :");
		String a = sc.nextLine();
		System.out.println("Enter your state name :");
		String s = sc.nextLine();
		System.out.println("Enter your phoneno :");
		int p = sc.nextInt();
		System.out.println("Enter your emailid");
		String e = sc.nextLine();
		System.out.println("new edited data");
		
		System.out.println("firstname :"  +n+ " "+"lastname :" +l+ " "+"address :"+a+ " "+"state :"+s+ " "+"phoneno :"+p+ " "+"email :"+e);
		
		
		
	}
	

}
