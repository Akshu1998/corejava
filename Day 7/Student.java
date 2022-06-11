import java.util.*;
class Student
{
	int sno;
	String sname;
	float smarks;
	char grade;

void getinput()
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the Student name: ");
	sname= sc.nextLine();
	System.out.print("Enter the Student no: ");
	sno= sc.nextInt();
	System.out.print("Enter the Student marks: ");
	smarks= sc.nextFloat();
}

void calcGrade()
{
	if (smarks>=80)
		grade= 'A';
	else if(smarks>=70)
		grade= 'B';
	else if(smarks>=50)
		grade= 'C';
	else
		grade= 'D';
}

void display()
{
	System.out.println("Student details are:-");
	System.out.println("Name:"+" "+sname);
	System.out.println("Sno."+" "+sno);
	System.out.println("Marks:"+" "+smarks);
	System.out.println("Grade:"+" "+grade);
}
public static void main(String[] args)
{
	Student s1=new Student();
	s1.getinput();
	s1.calcGrade();
        s1.display();
       
}
}
		



