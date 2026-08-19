import java.util.*;
class Prog
{
	int x,y;
	int add()
	{
		int add;
		add=x+y;
		return add;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x and y");
		Prog objj=new Prog();
		objj.x=sc.nextInt();
		objj.y=sc.nextInt();
		int z=objj.add();
		System.out.println("sum is "+z);
	}
}