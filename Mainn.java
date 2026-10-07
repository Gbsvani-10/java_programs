class Dem
{
	int[] meth(){
		int x[]=new int[5];
		int count=0;
		for(int i=0;i<x.length;i++)
		{
			x[i]=++count;
		}
		return x[];
	}
}
class Mainn{
	public static void main(String[] args){
		Dem obj=new Dem();
		int a[]=new int[5];
		a=obj.meth();
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]"+a[i]);
		}
	}
}