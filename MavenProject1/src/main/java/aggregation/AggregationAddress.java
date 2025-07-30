package aggregation;

public class AggregationAddress {


	public static void main(String[] args) 
	{
		AggregationStudent std = new AggregationStudent("Zaby",3);
		AggregationAddress add = new AggregationAddress("Dubai",std);
		add.Display();

	}
	
	String address;
	AggregationStudent obj;	

	AggregationAddress(String address, AggregationStudent obj)
	{
		this.address = address;
		this.obj = obj;
	}
	
	void Display()
	{
		System.out.println("****Student Details****");
		System.out.println("Name :  "+obj.name);
		System.out.println("Roll Number :  "+obj.rollNo);
		System.out.println("Address :  "+address);
		
	}	

}

//To ask Shadma - regarding the alignment in the output

