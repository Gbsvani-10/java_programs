class Crik
{
	int runs,wiks;
	void Score(int x,int y)
	{
		runs=x;
		wiks=y;
	}
	void Cal()
	{
		System.out.println("Runs:"+runs);
		System.out.println("Wickets:"+wiks);
	}
}
class Cric
{
	public static void main(String[] args)
	{
		Crik obj=new Crik();
		obj.Score(110,10);
		obj.Cal();
	}
}