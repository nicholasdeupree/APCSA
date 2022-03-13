
public class Rectangle {
	private int height, width;
	public Rectangle(int height, int width) {
		this.height=height;
		this.width=width;
	}
	public Rectangle(int size) {
		height=size;
		width=size;
	}
	public Rectangle() {
		height=1;
		width=1;
	}
	public boolean isSquare() {
		return height==width;
	}
	public void quadratize() {
		double sides = ((double)height*width)/((double)2);
		height = (int)sides;
		width = (int)sides;
	}
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(1,2);
		Rectangle r2 = new Rectangle();
	}
}
