
public class Character {
	double x,y,vx,vy;
	public Character(double x,double y,double vx,double vy) {
		this.x = x;
		this.y = y;
		this.vx = vx;
		this.vy = vy;
	}
	public void move() {
		x+=vx;
		y+=vy;
	}
	public  void draw(MyFrame f) {
		 
	}
}
