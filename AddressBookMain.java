package Address;
import java.util.Scanner;
public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("**** WELCOME TO ADDRESS BOOK MANAGEMENT SYSTEM ****");
		System.out.println("created address in adddress book: ");
		Contacts c = new Contacts("ashok","mane","Aurangabad","maharashtra",81800,"mail.com");
		System.out.println();
		System.out.println("**Adding new contact details**");
		System.out.println("enter your first name :");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter your last name :");
		String last = sc.nextLine();
		System.out.println("Enter your address :");
		String address = sc.nextLine();
		System.out.println("Enter your state name :");
		String state = sc.nextLine();
		System.out.println("Enter your phoneno :");
		int phoneno = sc.nextInt();
		System.out.println("Enter your emailid");
		String email = sc.nextLine();
		System.out.println();
		
		 AddNewContact a = new  AddNewContact();
		 a.AddressBookMain(name, last, address, state, phoneno, email);
		 
		 System.out.println();
		 
		 System.out.println("Edit stored contact details ");
		 System.out.println();
		 EditingContact e = new EditingContact();
		 e.Edit(name, last, address, state, phoneno, email);
		 System.out.println("**editted successfully**");
		 System.out.println();
		 System.out.println("deleting data :");
		 DeletingContact d = new DeletingContact ();
		 d.delete(name);
		
		
		
		
		
		
	}

}
