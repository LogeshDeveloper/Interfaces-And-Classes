package Interface;

public class TestEx implements Interface {

	public static void main(String[] args) {
		TestEx obj = new TestEx();
		obj.m1();

	}

	@Override
	public void m1() {
		System.out.println("Enter the name of the mobile");
	}

}
