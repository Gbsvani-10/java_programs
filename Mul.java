class Vol
{
	float r,pi=3.14f;
	int l,b,h;
	void Vol(float x)
	{
		r=x;
		System.out.println(pi*r*r);
	}
	void Vol(int x,int y)
	{
		l=x;
		b=y;
		System.out.println(l*b);
	}
	void Vol(int u,int v,int z)
	{
		l=u;
		b=v;
		h=z;
		System.out.println(l*b*h);
	}
}
class Mul
{
	public static void main(String[] args)
	{
		Vol obj=new Vol();
		obj.Vol(10);
		obj.Vol(2,5);
		obj.Vol(3,4,5);
	}
}