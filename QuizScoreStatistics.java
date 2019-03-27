import java.util.*;
public class QuizScoreStatistics{
	public static void main(String[] args){
		int Grade;
		int count=0;
		System.out.println("Please enter 99 student test scores on a grade-scale of 0-10");
		while(count<=99){
		Scanner inputDevice=new Scanner(System.in);
		Grade=inputDevice.nextInt();
		if(Grade<0||Grade>10){
			System.out.println("Error with this grade. Restart.");
			System.exit(0);}
		count++;}
		System.exit(0);}}
