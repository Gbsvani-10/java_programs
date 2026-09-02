class Crickettt
{
	int runs;
	public static void main(String args[])
	{
		Crickettt obj1=new Crickettt();
		obj1.runs=110;
		Crickettt obj2=new Crickettt();
		obj2=obj1;
		System.out.println(obj2.runs);
	}
}
	