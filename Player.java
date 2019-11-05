import java.util.Scanner;

public class Player extends GenericPlayer{
	
	public Player(String name) {
		super(name);
		}

	@Override
	public boolean isHitting(Scanner input) {
		do {
			System.out.printf("%s: Do you want to hit? (y/n)", name);
			String res = input.next();
			char c = res.charAt(0);
			
			if(c =='y' || c == 'Y') {return true;}
			else if(c =='n' || c == 'N') {return false;} 
			else {System.out.printf("Please enter y or n%n: ");}
		} 
		while(true);
	}
}
