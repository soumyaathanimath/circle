package circle;

public class Circle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle();
		Circle c2=new Circle();
		
		c1.radius=7;
		c2.radius=14;
		
		System.out.println("Area :"+c1.area());
		System.out.println("Perimeter :"+c1.perimeter());
		System.out.println("Circumference "+c1.circumference());
		
		System.out.println("Area :"+c2.area());
		System.out.println("Perimeter :"+c2.perimeter());
		System.out.println("Circumference "+c2.circumference());

	}

}
