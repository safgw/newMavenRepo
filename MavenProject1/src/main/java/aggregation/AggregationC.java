package aggregation;

public class AggregationC {
	String name;
	AggregationP obj;
	
	AggregationC(String name, AggregationP obj)
	{
		this.name=name;
		this.obj = obj;
	}
	
	void print()
	{
		System.out.println("Name is "+name);
		obj.print();
	}
	public static void main(String[] args) 
	{
		AggregationP objp= new AggregationP(3,"zaby@gmail.com");
		AggregationC objc= new AggregationC("Zion", objp);
		objc.print();
		

	}

}
