class Cricket
{
	int runs;
	public static void main(String args[])
	{
		Cricket obj1=new Cricket();
		obj1.runs=110;
		Cricket obj2=obj1;
		System.out.println(obj2.runs);
	}
}
	