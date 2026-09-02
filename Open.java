class Close
{
	int x;
	void setx(int a)
	{
		x=a;
	}
	void setobj(Close obj)
	{
		System.out.println("x="+obj.x);
	}
}
class Openn
{
	public static void main(String[] args)
	{
		Close obj=new Close();
		obj.setx(10);
		Close obj1=new Close();
		obj1.setx(20);
		obj1.setobj(obj);
		obj.setobj(obj1);
	}
}