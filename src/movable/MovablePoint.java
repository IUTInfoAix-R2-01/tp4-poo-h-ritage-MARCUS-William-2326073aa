package movable;

public class MovablePoint implements Movable{
	public int x;
	public int y;
	public int xSpeed;
	public int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x =x;
		this.y=y;
		this.xSpeed=xSpeed;
		this.ySpeed=ySpeed;
	}
	
	public String toString() {
		return "("+x+","+y+") speed=("+x+","+y+")";
	}

	@Override
	public void moveUp() {
		y-=ySpeed;
		
	}

	@Override
	public void moveDown() {
		y+=ySpeed;
		
	}

	@Override
	public void moveLeft() {
		x-=xSpeed;
		
	}

	@Override
	public void moveRight() {
		x+=xSpeed;
		
	}
	
	public static void main(String[] args) {
		MovablePoint m = new MovablePoint(2,25,10,5);
		System.out.println(m);
		m.moveLeft();
		m.moveUp();
		System.out.println(m);
		
		
	}
}
