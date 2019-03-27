import java.util.*;
public class Inbetween {
	public static void main(String[] args)
	{
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please Enter Two Integers:");
		int integer1 = inputDevice.nextInt();
		int integer2 = inputDevice.nextInt();
		
		if(integer1 == integer2) {
			System.out.println("There are no integers between the two numbers selected");
			System.exit(0);
		}
		while(integer1 > integer2) {
			integer2++;
			if(integer1 == integer2) {
				System.exit(0);
			}
			System.out.print(integer2 + " ");
			
		}
		while(integer2 > integer1) {
			integer1++;
			if(integer1 == integer2) {
				System.exit(0);
			}
			System.out.print(integer1 + " ");
			
		}
		
	}
}
