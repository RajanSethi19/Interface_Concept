package Interface_Concepts;

interface start {
	void test1();

	void test2();

}

public class Interface_one implements start {
// here when the method is inherited access specifier comes public automatically 
	public void test1() {
		System.out.println("I am in test 1");

	}

	public void test2() {

		System.out.println("I am in test 2");
	}

	public static void main(String[] args) {
		Interface_one im= new Interface_one();
		im.test1();
		im.test2();
		

	}

}
