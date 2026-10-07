class Cricket{
int runs;
int wickets;
Cricket Score(int r,int w)
{
System.out.println("Welcome to match");
this.runs=r;
this.wickets=w;
return this;
}
}
class DevPro
{
public static void main(String[] args)
{
Cricket obj1=new Cricket();
Cricket obj2=new Cricket();
obj2.runs=210;
obj2.wickets=2;
obj2=obj1.Score(115,3);
System.out.println("obj2.runs="+obj2.runs);
System.out.println("obj2.wickets="+obj2.wickets);
}
}