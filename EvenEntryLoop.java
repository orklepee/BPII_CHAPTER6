import java.util.*;
public class EvenEntryLoop {
	public static void main(String[] args){
		int userinput = 0;
		while(userinput != 999){
			System.out.println("Enter an even number or 999 to stop");
			Scanner inputDevice = new Scanner(System.in);
			userinput = inputDevice.nextInt();
			if(userinput % 2 == 0){
				System.out.println("Good job!");}
			else if(userinput == 999){
				System.exit(0);}
			else{
				System.out.println("ERROR: Please enter an even number.");}
			System.out.println("");}}}
