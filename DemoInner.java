class A
{
	public int a=10;
	void display1()
	{
		System.out.println(a);
	}
}
class B extends A
{
	public int b=20;
	void display2()
	{
		b=b+a;
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
}
class DemoInner{
	public static void main(String[] args)
	{
		B obj=new B();
		obj.display1();
		System.out.println(obj.b);
		obj.display2();
	}
}