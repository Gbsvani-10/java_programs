import java.util.Scanner;
class Menu
{
	int sno,price;
	String code,item;
	Menu()
	{	
		for(int i=0;i<4;i++)
		{
			System.out.println("sno||item||code||price|");
			System.out.println(sno[i]++item[i]++code[i]++price[i]);
			System.out.println(sno[i]++item[i]++code[i]++price[i]);
			System.out.println(sno[i]++item[i]++code[i]++price[i]);
			System.out.println(sno[i]++item[i]++code[i]++price[i]);
		}
	}
}
class Breakfast
{
	public static void main(String[] args)
	{
		int Number,bill;
		String I_code;
		Scanner sc=new Scanner(System.in);
		Menu obj=new Menu();
		System.out.println("Enter your choice Item code:");
		I_code=sc.next();
		System.out.println("enter the number of plates you want:");
		Number=sc.nextInt();
		switch(I_code)
		{
			case id:
				bill=obj.price*Number;
				System.out.println("total bill is:"+bill);
			case dos:
				bill=obj.price*Number;
				System.out.println("total bill is:"+bill);
			case va:
				bill=obj.price*Number;
				System.out.println("total bill is:"+bill);
		}
		sc.close();
	}
}