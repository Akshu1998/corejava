import java.util.*;
class Employees
{
	int eno;
	String ename;
	int category;
	float grosssalary;
	float netsalary;
	float pfdeduction;

Employees() //Constructor 
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Emplyee name: ");
	ename= sc.nextLine();
	System.out.print("Enter the Employee number: ");
	eno= sc.nextInt();
	System.out.print("Enter the Category: ");
	category= sc.nextInt();
	System.out.print("Enter the Gross Saalary: Rs. ");
	grosssalary= sc.nextFloat();
}

void salarycalc()
{
	if(category == 1)
	{	pfdeduction= 2400;
		netsalary= grosssalary - pfdeduction;
	}
	else if(category == 2)
	{       pfdeduction= 2200;
		netsalary= grosssalary - pfdeduction;
	}
	else if(category == 3)
	{	pfdeduction= 2000;
		netsalary= grosssalary - pfdeduction;
	}
	else 
	{	
	        pfdeduction= 1800;
		netsalary= grosssalary - pfdeduction;
        }
}

static String organization()
{
String cname="Acts Chennai CDAC";	
return(cname);
}

void display()
{
	System.out.println();
	System.out.println("Detail of the Employee is as follows: ");
	System.out.println();
	System.out.println("Name: " + ename);
	System.out.println("Emplyee no: " +eno);
	System.out.println("Category: " +category);
	System.out.println("Gross Salary: Rs. " +grosssalary);
	System.out.println("PF Deduction: Rs. " +pfdeduction);
	System.out.println("Net Salary: Rs. " +netsalary);
}

public static void main(String[] args)
{
	String org= organization();
	Employees E1=new Employees();

	E1.salarycalc();
	E1.display();
	System.out.println("Organization Name: " +org);

}
}


