package inheritanceEx;

public class main {
	public static void main(String[] args) {
		Circle c = new Circle();
		
		System.out.println(c.getX());
		System.out.println(c.getY());
		
		c.setX(20);
		c.setY(30);
		
		System.out.println(c.getX());
		System.out.println(c.getY());
	}
}
