class Game
{
	int runs=50,wickets=3;
	void Score(int x,int y)
	{
		runs=x+10;
		wickets=y+1;
	}
}
class Match
{
	public static void main(String[] args)
	{
		int runs=20,wickets=2;
		Game obj=new Game();
		System.out.println(obj.runs+" "+obj.wickets);
		obj.Score(runs,wickets);
		System.out.println(obj.runs+" "+obj.wickets);
	}
}