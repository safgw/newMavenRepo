 // Encapsulation
// Parent is Circle

package sample;

public class CircleChild {

	public static void main(String[] args) 
	{
		Circle obj = new Circle();
		obj.setRadius(2);
		System.out.println("Radius is "+obj.getRadius());
		System.out.println("Area is "+obj.calculateArea());
		System.out.println("Perimeter is "+obj.calculatePerimeter());

	}

}
