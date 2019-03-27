public class DemoIncrement2 {
	public static void main(String[] args)
	{
		int v = 4;
		int plusPlusV = ++v;
		v = 4;
		int vPlusPlus = v++;
		System.out.println("V is " + v);
		System.out.println("++v is " + plusPlusV);
		System.out.println("V++ is " + vPlusPlus);
		int w = 17, x = 17, y = 18;
		boolean compare1 = (++w == y);
		boolean compare2 = (x++ == y);
	}
}
