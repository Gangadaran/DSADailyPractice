package assessmentProblems;

public class A {
	public void mango() {
		System.out.println("Gangadaran");

	}
	
	
	A a = new A() {
		public void mango() {
			System.out.println("anu");

		}
	};
	
	
	public static void main(String[] args) {
		A a = new A();
		a.mango();
	}
}
