package aggregation;

public class Book {
	
	String n;
	int date;
	Author auth;// aggregation has been occured here
	
	Book(String n, int date,Author auth )
	{
		this.n=n;
		this.date=date;
		this.auth=auth;
		
	}
void display()
{
	System.out.println(n);
	System.out.println(date);
	auth.page();

}
public static void main(String args[])
{
	Author obj=new Author("roosling",250);
	Book obj1=new Book("holiday",12-12-2023,obj) ;
	obj1.display();
	
}
}
