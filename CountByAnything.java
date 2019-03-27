import java.util.*;
public class CountByAnything{
	public static void main(String[] args){
		int LOOP_COUNTER = 0;
		int counter = 0;
		int countby;
		System.out.println("Up to '10,000' places, enter what number you'd like to count by:");
		Scanner inputDevice = new Scanner(System.in);
		countby = inputDevice.nextInt();
		while(LOOP_COUNTER <= 10){
			if(counter > 10000){
				System.exit(0);}
			LOOP_COUNTER++;
			if(LOOP_COUNTER > 10){
				System.out.println("");
				LOOP_COUNTER = LOOP_COUNTER - 11;}
			else{
			counter = counter + countby;
			if(counter > 10000){
				System.exit(0);}
			System.out.println(counter);}}}}
