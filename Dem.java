class Demo
{
	void meth(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			System.out.println("x["+i+"]"+x[i]);
		}
	}
}
class Dem{
	public static void main(String[] args)
	{
		Demo obj=new Demo();
		int a[]=new int[5];
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=count++;
		}
		obj.meth(a);
	}
}