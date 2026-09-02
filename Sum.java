class Demo
{
	int a,b;
	Demo(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("sum of a and b:"+(a+b));
	}
}
class Sum
{
	public static void main(String[] args)
	{
		Demo obj=new Demo(10,20);
	}
}