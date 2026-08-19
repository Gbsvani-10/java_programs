class Student
{
	int id;
	String name;
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("Student name:"+name);
	}
}
class codeDemoo
{
	public static void main(String args[])
	{
		Student obj11=new Student();
		obj11.id=123;
		obj11.name="sai";
		obj11.display();
		Student obj22=new Student();
		obj22.id=142;
		obj22.name="ajay";
		obj22.display();
	}
}