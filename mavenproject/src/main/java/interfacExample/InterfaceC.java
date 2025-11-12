package interfacExample;

public class InterfaceC implements ParentA , InterfaceB {
	
	public void game()
	{
		System.out.println("method one in parent A");
	}
	public void display(String name)
	{
		System.out.println(name);
	}
	public void print()
	{
		System.out.println("the game is super");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceC obj=new InterfaceC();
		obj.game();
		obj.display("supermario");
		obj.print();

	}

}
