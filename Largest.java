//Write a Java Program to Find the Largest of Three Numbers
import java.util.*;
 public class Largest{
 	public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,b,c;
 	System.out.println("Enter three numbers");
        a=sc.nextInt();
 	b=sc.nextInt();
	c=sc.nextInt();
	if(a>b&& a>c)
	{
		System.out.printf("%d is greater", a);

	}
        else if( b>a && b>c)
	{
		System.out.printf("%d is greater",b);

	}
         else{
			System.out.printf("% d is greater",c);

		}
}
}

