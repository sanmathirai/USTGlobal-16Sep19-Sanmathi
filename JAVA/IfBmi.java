/*
BMI
below 18.5 - You're in underweight range
between 18.5 and 24.9 - You're in healthy  weight range
between 25 and 29.9 - You're in Overweight range
between30 and 39.9 - You're in the obese range
*/

class IfBmi
{
	public static void main(String args[])
	{
		int weight=501;
		double height = 1.58;
		double bmi;
		bmi = weight/(height * height );
		System.out.println("BMI is "+bmi);
		if(bmi >39.9)
		
			System.out.println("Invalid range");
		
		else if(bmi>=30 && bmi<=29.9)
		{
			System.out.println("You're in the obese range");
		}
		else if(bmi>=25)
		{
			System.out.println("You're in Overweight range");
		}
		else if(bmi>=18.5)
		{
			System.out.println("You're in healthy  weight range");
		}
		else if(bmi<18.5)
		{
			System.out.println("You're in underweight range");
		}
	}
}
