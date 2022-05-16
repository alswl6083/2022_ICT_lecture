package rectangleEx;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public int square() {
		return width * height;
	}
	public void show() {
		System.out.println("("+this.x+","+this.y+")에서 크기가 " + this.width + "X" + this.height +"인 사각형");
	}
	public boolean contains(Rectangle r) {
		if(r.x >= this.x && r.y >= this.y) {
			if((r.x + r.width) <= (this.x + this.width) && (r.y + r.height) <= (this.y + this.height)) {
				return true;
			} else {
				return false;
			}
		}
		else
			return false;
	}
}

