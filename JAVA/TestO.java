/*o find fact of number*/
class TestO
{
	public static void main(String args[])
	{
		long factorial=fact(5);
		System.out.println(factorial);

	}
	static long fact(int num)
	{
		int fact=1;
		for(int i=num;i<=1;i--)
		{
		fact=fact*i;
		}
		return fact;
		
			
	}
}