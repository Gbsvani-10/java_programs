import java.util.Scanner;
class Breakfast{
	int dosa(int n){
		int sno=1;
		String item="dosa";
		String code="doa";
		int price=30;
		int num=n;
		System.out.println("item="+item+" "+"price="+price);
		return num*price;
	}
	int idly(int n){
		int sno=2;
		String item="idly";
		String code="idl";
		int price=25;
		int num=n;
		System.out.println("item="+item+" "+"price="+price);
		return num*price;
	}
	int vada(int n){
		int sno=3;
		String item="vada";
		String code="vad";
		int price=35;
		int num=n;
		System.out.println("item="+item+" "+"price="+price);
		return num*price;
	}
	int bajji(int n){
		int sno=1;
		String item="bajji";
		String code="bajji";
		int price=30;
		int num=n;
		System.out.println("item="+item+" "+"price="+price);
		return num*price;
	}
}
class Tiffin{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		int number=sc.nextInt();
		Breakfast obj=new Breakfast();
		System.out.println("enter no of items="+number);
		System.out.println("enter your choice="+ch);
		switch(ch)
		{
			case 1:
				int total_price=obj.dosa(number);
				System.out.println("total price="+total_price);
				break;
			case 2:
				total_price=obj.idly(number);
				System.out.println("total price="+total_price);
				break;
			case 3:
				total_price=obj.vada(number);
				System.out.println("total price="+total_price);
				break;
			case 4:
				total_price=obj.bajji(number);
				System.out.println("total price="+total_price);
				break;
			default:
				System.out.println("item is not found");
		}
	}
}