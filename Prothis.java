class Cricket{
int runs;
int wickets;
void Score(){
System.out.println("Welcome to Scorecard");
}
void Score(int x,int y)
{
this.Score();
runs=x;
wickets=y;
System.out.println("Runs="+runs);
System.out.println("Wickets="+wickets);
}
}
class Prothis{
public static void main(String[] args)
{
Cricket obj1=new Cricket();
obj1.Score(110,2);
}
}