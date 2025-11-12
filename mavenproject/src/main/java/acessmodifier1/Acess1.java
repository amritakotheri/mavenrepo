package acessmodifier1;

public class Acess1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Acess1 obj=new Acess1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.dispaly3();
		

	}
    public void display()
    {
    	System.out.println("public");
    }
    private void display1()
    {
    	System.out.println("private");
    }
    protected void display2()
    {
    	System.out.println("protected");
    }
    void dispaly3()
    {
    	System.out.println("default");
    }
}

