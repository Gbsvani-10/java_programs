class Demo4
{
	int x=10;
	public static void main(String args[])
	{	
		Demo4 obj=new Demo4();
		Demo4 obj1=new Demo4();
		Demo4 obj2=new Demo4();
		obj1.x=20;
		obj2.x=30;
		System.out.println("x="+obj.x+" "+"obj="+obj);
		System.out.println("x="+obj1.x+" "+"obj="+obj1);
		System.out.println("x="+obj2.x+" "+"obj="+obj2);
	}
}