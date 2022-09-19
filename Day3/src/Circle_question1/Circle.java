package Circle_question1;

public class Circle {

	double radius;
	double area;

	public Circle(double radius) {
		if(radius < 1)
			return;
		this.radius = radius;
	}

	public double calculateArea() {
		this.area = 3.14 * this.radius * this.radius;
		return this.area;
	}

	public static void main(String[] args) {
		Circle c = new Circle(5);
		System.out.println(c.calculateArea());
	}
}
