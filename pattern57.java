public class pattern57{
	public static void main(String args[])
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if((i%2==0&&j%2==0)||(i%2==1&& j%2==1))
				{
					System.out.print("X");
				}
				else{
					System.out.print("O");
				}
			}
			System.out.println();
		}	
	}
}