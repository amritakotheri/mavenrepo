package superkeyword;

public class SuperConstructorC extends SuperConstructorP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructorC obj=new SuperConstructorC("asdf");
		

	}
	SuperConstructorC(String s)
	{
		super(23);
		System.out.println("child constructor "+s);
	}

}
