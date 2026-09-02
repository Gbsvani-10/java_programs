class Vol
{
	float r,pi=3.14f;
	int l,b,h;
	Vol(float x)
	{
		r=x;
		System.out.println(pi*r*r);
	}
	Vol(int x,int y)
	{
		l=x;
		b=y;
		System.out.println(l*b);
	}
	Vol(int u,int v,int z)
	{
		l=u;
		b=v;
		h=z;
		System.out.println(l*b*h);
	}
}
class Area1
{
	public static void main(String[] args)
	{
		Vol obj=new Vol(10);
		Vol obj1=new Vol(2,5);
		Vol obj2=new Vol(2,5,10);
	}
}