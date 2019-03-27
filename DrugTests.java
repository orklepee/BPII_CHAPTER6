import java.util.*;
public class DrugTests {
	public static void main(String[] args) {
		int week = 1;
		while(week <= 52) {
			int testedEmployee = 1 + (int) (Math.random() * 30);
			int testedEmployee2 = 1 + (int) (Math.random() * 30);
			int testedEmployee3 = 1 + (int) (Math.random() * 30);
			int testedEmployee4 = 1 + (int) (Math.random() * 30);
			System.out.println("Week: " + week);
			System.out.println("");
			System.out.println(testedEmployee + " " + testedEmployee2 + " " + testedEmployee3 + " " + testedEmployee4);
			System.out.println("");
			week++;
		}
		System.exit(0);
	}
}
