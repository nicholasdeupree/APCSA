
public class LoopPrac {
	public static void main(String[] args)
	{
		int x = 19; int y = 20;
		while (x < y)
		{
			System.out.println(x);
			if (x < 100) {
				continue;
			}
			x++;
		}
	}
}
