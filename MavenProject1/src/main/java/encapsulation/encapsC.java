package encapsulation;

public class encapsC {

	public static void main(String[] args) {
		encapsP obj = new encapsP();
		obj.setName("Zach");
		obj.setSub("Eng");
		obj.setMark(80);
		
		System.out.println(obj.getName());
		System.out.println(obj.getSub());
		System.out.println(obj.getMark());
		
	}

}
