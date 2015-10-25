package introJava;

public class Rectangle {
	
	int width=20;
	int height;
	
	void show()

	{
		System.out.println("details are : ( " + width + ", " + height + ")");
	}
	
	int area()
	{
		return width*height;
	}
	int perimeter() {
		int p;
		p=(width+height)*2;
		return p;
	}

	void copyValues (Rectangle sourceRectangle){
		this.width = sourceRectangle.width;
		this.height = sourceRectangle.height;
	}
}
