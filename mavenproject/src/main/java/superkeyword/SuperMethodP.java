package superkeyword;

public class SuperMethodP {
	public void paint() 
	{
		System.out.println("parent paint");
	}
	public void sing()
	{
		this.paint();
		System.out.println("parent sings");
	}



}
