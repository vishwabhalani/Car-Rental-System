import java.util.Scanner;
class info
{
	static Scanner sc=new Scanner(System.in);
	static int customerId=0;
	String name;
	String id;
	int days;
	public void name()
	{
		System.out.println("Enter Your Name:");
		sc.nextLine();
		name=sc.nextLine();
	}
	public void cars()
	{
		System.out.println("Available Cars:");
		System.out.println("C001-Suzuki Baleno");
		System.out.println("C002-Honda Accord");
		System.out.println("C003-Mahindra Thar");
		System.out.print("Enter The Car ID You Want:");
		id=sc.nextLine().toUpperCase();
	}
	public void rent()
	{
		System.out.print("Enter Number of Days For Rental:");
		days=sc.nextInt();
	}
	public void information()
	{
		customerId++;
		System.out.println("----Car Rental Information----");
		System.out.println("Customer ID:"+customerId);
		System.out.println("Customer Name:"+name);
		String select;
		select=id;
		if(select.equals("C001"))
		{
			System.out.println("Car ID:C001");
			System.out.println("Car:Suzuki Baleno");
		}
		else if(select.equals("C002"))
		{
			System.out.println("Car ID:C002");
			System.out.println("Car:Honda Accord");
		}
		else if(select.equals("C003"))
		{
			System.out.println("Car ID:C003");
			System.out.println("Car:Mahindra Thar");
		}
		System.out.println("Rental Days:"+days);
		if(select.equals("C001"))
		{
			System.out.println("Per Day Rent Of Suzuki Baleno:100");
			System.out.println("Total Price:"+days*300);
		}
		else if(select.equals("C002"))
		{	
			System.out.println("Per Day Rent Of Honda Accord:150");
			System.out.println("Total Price:"+days*350);
		}
		else if(select.equals("C003"))
		{
			System.out.println("Per Day Rent Of Mahindra Thar:250");
			System.out.println("Total Price:"+days*500);
		}
		else
		{
			System.out.println("Entered Car ID Doesn't Exist in our System.");
		}
		System.out.print("Confirm Rental(Y/N):");
		char ch=sc.next().toUpperCase().charAt(0);
		if(ch=='Y')
		{
			System.out.println("Car Rented Successfully");
		}
		else if(ch=='N')
		{
			System.out.println("Car Rented Cancelled");
			id="";
		}
		else
		{
			System.out.println("Entered Car Doesn't Available");
		}
	}
	public void returns()
	{
		int ids;
		System.out.print("Enter Your Customer ID:");
		ids=sc.nextInt();
		sc.nextLine();
		if(customerId==ids)
		{
			System.out.print("");
		}
		else
		{ 
			System.out.println("Entered customerId Doesn't Exist");
		}
		System.out.print("Enter Car ID:");
		String carId=sc.nextLine().toUpperCase();
		if(carId.equals(id))
		{
			System.out.println("Car Returned Successfully");
		}
		else
		{
			System.out.println("Entered Car didn't Rented by You");
		}
	}
}
public class car
{
	public static void main(String[] args) {
		info i1=new info();
		int choice;
		do
		{
			System.out.println();
			System.out.println("---------------------------------------------------------Car Rental System---------------------------------------------------------");
			System.out.println("1.Rent a Car");
			System.out.println("2.Return a Car");
			System.out.println("3.Exit");
			System.out.print("Enter Your Choice:");
			choice=info.sc.nextInt();
		    if(choice==1)
		    {
		    	System.out.println();
			    System.out.println("---Rent a Car---");
				i1.name();
				i1.cars();
				i1.rent();
				i1.information();
			}
			else if(choice==2)
			{
				System.out.println();
				System.out.println("---Return a Car---");
				i1.returns();
			}
		}while(choice!=3);
	}
}