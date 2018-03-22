package AbstractClass;

public class CallingAbstract extends Prog {

	public static void main(String[] args) {
		CallingAbstract objab = new CallingAbstract();
		objab.m1();
		objab.m2();		

	}

	@Override
	void m1() {
		System.out.println("This is Method 1");
	}

	@Override
	void m2() {
		System.out.println("Method 2 Overwrited");
	}
}
