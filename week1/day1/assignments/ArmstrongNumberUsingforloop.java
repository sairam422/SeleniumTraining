package week1.day1.assignments;

public class ArmstrongNumberUsingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=371;
		int result=0;
		for (int i=num;i!=0;i/=10)
		{
			int rem=i%10;
			result=result+(rem*rem*rem);
		}
		if(result==num)
			System.out.println(result+" is an Armstrong Number");
		else
			System.out.println(num+" is not an Armstrong number");
	}
	
	

}
