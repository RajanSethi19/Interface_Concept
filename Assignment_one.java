package Interface_Concepts;

interface City1 {
	void banglore();

	void pune();

}

abstract class City2 implements City1 {
	abstract void indore();

	abstract void mumbai();

	void hyderabad() {
		System.out.println("I am in method hyderabad");
	}

	void chennai() {
		System.out.println("I am in method chennai");
	}

}

public class Assignment_one extends City2 {

	void chandigarh() {
		System.out.println("I am in method Chandigarh");
	}

	void amritsar() {
		System.out.println("I am in method Amritsar");
	}

	public void banglore() {
		System.out.println("I am in method banglore");
	}

	public void pune() {
		System.out.println("I am in method pune");
	}

	void indore() {
		System.out.println("I am in method indore");
	}

	void mumbai() {
		System.out.println("I am in method mumbai");
	}

	public static void main(String[] args) {
		Assignment_one a = new Assignment_one();
		a.amritsar();
		a.banglore();
		a.chandigarh();
		a.chennai();
		a.indore();
		a.hyderabad();
	}

}
