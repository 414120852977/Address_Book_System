package Address;

public class Contacts {
	String firstname;
	String lastname;
	String address;
	String state;
	long phoneno;
	String email;
	public Contacts(String f,String l, String a,String s,long p,String e)
	{
		this.firstname = f;
		this.lastname = l;
		this.address = a;
		this.state = s;
		this.phoneno = p;
		this.email = e;
		System.out.println("firstname:" +f+" " +"lastname:"  +l+ " "+ "address :" +a+ " "+ "state :" +s+ " "+"phoneno :" +p+ " "+"email :" +e);
	}
	
}
