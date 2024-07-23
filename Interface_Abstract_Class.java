package Interface_Concepts;

interface I1 {

	void test1();

}

abstract class Test implements I1 {

	abstract void test2();

}

public class Interface_Abstract_Class extends Test {

	public void test1() {
		System.out.println("test1");

	}

	void test2() {
		System.out.println("test2");

	}

	public static void main(String[] args) {
		Interface_Abstract_Class ab= new Interface_Abstract_Class();
		
ab.test1();
ab.test2();
	}

}
