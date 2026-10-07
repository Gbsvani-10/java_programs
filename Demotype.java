import java.util.Scanner;
class Demotype{
	public static void main(String[] args)
	{
		int x[]=new int[5];
		int i,sum=0;
		Scanner obj=new Scanner(System.in);
		for(i=0;i<x.length;i++)
		{
			x[i]=obj.nextInt();
			sum=sum+x[i];
		}
		System.out.println("Sum="+sum);
		for(i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}
}