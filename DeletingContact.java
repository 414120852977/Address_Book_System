package Address;
import java.util.Scanner;

public class DeletingContact {
	
	
	void delete(String n){
		System.out.println("write name to delete data :");
		Scanner sc = new Scanner(System.in);
		String n1 = sc.nextLine();
		if(n1 == n1){
			System.out.println("data leleted succesuly with name" +n1);
		}else{
			System.out.println("data not created");
		}
		
		
	}

}
