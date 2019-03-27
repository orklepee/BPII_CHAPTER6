import java.util.*;
public class CountByFives{
	public static void main(String[] args){
		int counter = 5;
		int loopcount = 1;
		System.out.println(counter);
	while(counter < 500){
		while((counter % 500) != 0){
			counter = counter + 5;
			if(loopcount == 10){
				loopcount = loopcount - 10;
				System.out.println("");}
			if(counter > 500){
				System.exit(0);}
			loopcount++;
			System.out.println(counter);}}}}


