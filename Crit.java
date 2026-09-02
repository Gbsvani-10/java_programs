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
	float avg()
	{
		float avg=runs/wiks;
		return avg;
	}
}
class Crit
{
	public static void main(String[] args)
	{
		Crik obj=new Crik();
		obj.Score(110,10);
		obj.Cal();
		float avg=obj.avg();
		System.out.println("average:"+avg);
	}
}