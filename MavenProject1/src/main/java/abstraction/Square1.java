package abstraction;

public class Square1 extends Perimeters  {

	public static void main(String[] args) 
	{
		Perimeters cir = new Circle1();
		Perimeters sqr = new Square1();
		cir.perim(1);
		sqr.perim(4);		

	}

	@Override
	public void perim(int r) 
	{
		System.out.println("Perimeter of circle is "+4*r);
		
	}

}
