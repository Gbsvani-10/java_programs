class Close
{
	int runs,matches;
	float avg;
	void Calavg()
	{
		avg=runs/matches;
	}
	void display()
	{
		System.out.println("Average:"+avg);
	}
}
class Crik
{
	public static void main(String[] args)
	{
		Close obj=new Close();
		obj.runs=250;
		obj.matches=5;
		obj.Calavg();
		obj.display();
	}
}