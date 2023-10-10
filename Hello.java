public class Hello {
	void goforvote (int age) {
		if (age >=18 && age <100) {
		System.out.println("vote success");
	}else

	{
		System.out.println("not accept");}
	}

	public static void main(String[] args) {
		Hello h = new Hello();
		h.goforvote(190 );
	}
}
