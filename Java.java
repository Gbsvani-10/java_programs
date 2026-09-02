class Score
{
	int runs,wickets;
	Score()
	{
		this (110,2);
		System.out.println(runs+" "+wickets);
		System.out.println("Welcome to Match");		
	}
	Score(int x,int y)
	{
		runs=x;
		wickets=y;
	}
}
class Java
{
	public static void main(String[] args)
	{
		Score obj=new Score();
	}
}