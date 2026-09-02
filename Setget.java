class Sg
{
	private int x;
	void set(int a)
	{
		x=a;
	}
	void get()
	{
		System.out.println("x="+x);
	}
}
class Setget
{
	public static void main(String[] args)
	{
		Sg obj=new Sg();
		obj.set(10);
		obj.get();
	}
}