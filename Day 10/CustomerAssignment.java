class CustomerAssignment
{
	int cid;
	String cname;
 
public CustomerAssignment(int cid, String cname)
{
	this.cid=cid;
	this.cname=cname;
}

public void display()
{
	System.out.println("Customer ID: "+cid);
	System.out.println("Customer Name: "+cname);
}
}

class RetailCustomer extends CustomerAssignment
{
	int ccno;

public RetailCustomer(int cid, String cname, int ccno)
{
	super(cid,cname);
	this.ccno=ccno;
}

public void display()
{
	System.out.println("Customer ID: "+cid);
	System.out.println("Customer Name: "+cname);
	System.out.println("Customer credit card no: "+ccno);
}
}

class WholesaleCustomer extends CustomerAssignment
{
	int accno;

public WholesaleCustomer(int cid, String cname, int accno)
{
	super(cid,cname);
	this.accno=accno;
}

public void display()
{
	System.out.println("Customer ID: "+cid);
	System.out.println("Customer Name: "+cname);
	System.out.println("Customer Account no: "+accno);
}
}

class TestCustomerAssignment
{
	public static void main(String[] args)
	{
		CustomerAssignment c1=new CustomerAssignment(28,"Anik Sinha");
		c1.display();

		CustomerAssignment r1=new RetailCustomer(28,"Anik Sinha",9836);
		r1.display();

		CustomerAssignment w1=new WholesaleCustomer(28,"Anik Sinha",4525);
		w1.display();
	}
}
