package introJava;

public class MainClass {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		Rectangle r2 = new Rectangle();

		r2.width = 20;
		r2.height = 10;
		
		Rectangle x = new Rectangle();
		x.width = 5;
		x.height = 6;

		System.out.println("Before:");
		r1.show();
		r2.show();
		
	    r1.copyValues(r2);

		System.out.println("After:");
		r1.show();
		r2.show();
		r1.width=100;
		System.out.println("After change of value: ");
		r1.show();
		r2.show();
	}

}
