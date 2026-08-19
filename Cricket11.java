class Cricket11
{
	int runs;
	public static void main(String args[])
	{
		Cricket11 obj1=new Cricket11();
		obj1.runs=110;
		Cricket11 obj2=new Cricket11();
		obj2=obj1;
		System.out.println(obj2.runs);
	}
}
	