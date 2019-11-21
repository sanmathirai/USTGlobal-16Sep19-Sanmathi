/*Program to calculate circumferrence of circle*/
class TestN
{
	public static void main(String args[])
	{
		double circumferrence=circumCircle(4);
		System.out.println(circumferrence);
		boolean result=oddEven(1);
		System.out.println(result);
		
	}
	static double circumCircle(int radius)
	{
		return 2*3.14*radius;
	}
	static boolean oddEven(int number)
	{
		if(number%2==0)
		{
			return true;

		}
		else
		{
			return false;
		}
	}
	
}