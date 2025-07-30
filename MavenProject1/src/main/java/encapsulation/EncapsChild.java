package encapsulation;

public class EncapsChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsParent obj = new EncapsParent();// Use parent object commonly but can also use Child class
		obj.setAge(3);
		System.out.println(obj.getAge());
		obj.setNme("Zach");
		System.out.println(obj.getName());		

	}

}
