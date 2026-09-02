class Cri
{
	public int runs;
	private int wickets;
	public void display()
	{
		wickets=2;
		System.out.println("Wickets:"+wickets);
	}
}
class Prog1
{
	public static void main(String[] args)
	{
		Cri obj=new Cri();
		obj.runs=100;
		obj.display();
	}
}