class Cricket{
		int runs;
		int wickets;
		void Score(int runs,int wickets)
		{
			this.runs=runs;
			this.wickets=wickets;
		}
}
class ProJava
{
	public static void main(String[] args)
	{
		Cricket obj=new Cricket();
		obj.Score(110,2);
	}
}