package inheritance;

public class HeirarchyC2 extends HeirarchyP {
	public void shoot()
	{
		System.out.println("shoot the dart");
	}
	public static void main(String[] args)
	{
		HeirarchyC2 obj=new HeirarchyC2();
		obj.draw();
		obj.shoot();
		obj.paint();
		
	}

}
