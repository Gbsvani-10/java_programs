class Cro
{
	float r;
	final float pi=3.14f;
	void rad(float x)
	{
		r=x;
		System.out.println(r);
	}
	float area()
	{
		return pi*r*r;
	}
	float peri()
	{
		return 2*pi*r;
	}
}
class Cricle
{
	public static void main(String[] args)
	{
		Cro obj=new Cro();
		obj.rad(10.5f);
		float area=obj.area();
		float peri=obj.peri();
		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+peri);
	}
}