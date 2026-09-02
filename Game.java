class Match
{
	int runs,wickets;
	void Score(int x,int y)
	{
		runs=x+10;
		wickets=y+1;
	}
}
class Game
{
	public static void main(String[] args)
	{
		int runs=20,wickets=2;
		Match obj=new Match();
		System.out.println(runs+" "+wickets);
		obj.Score(runs,wickets);
		System.out.println(runs+" "+wickets);
	}
}