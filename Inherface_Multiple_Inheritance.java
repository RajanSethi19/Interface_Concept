package Interface_Concepts;



interface car{
	void start();
}
interface bike {
	void start1();
}


public class Inherface_Multiple_Inheritance implements car,bike{
	
	public void start() {
		System.out.println("method of interface 1");
		
	}

	public void start1() {
		System.out.println("method of interface 2");
		
	}
	public static void main(String[] args) {
		Inherface_Multiple_Inheritance m= new Inherface_Multiple_Inheritance();
		m.start();
		m.start1();

	}

	

}
