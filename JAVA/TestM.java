/*Program to calculate area of circle*/
class TestM
{
	public static void main(String args[])
	{
		double area=areaCircle(4);
		System.out.println(area);
	}
	static double areaCircle(int radius)
	{
		return 3.14*radius*radius;
	}
}