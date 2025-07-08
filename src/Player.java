import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Player extends Character implements KeyListener,MouseListener {
	public void draw(MyFrame f) {
		f.setColor(0, 128, 0);
		f.fillRect(x, y+20, 30, 10);
		f.setColor(200, 200, 200);
		f.fillRect(x+10, y, 10, 30);
	}
	public Player(double x,double y,double vx,double vy) {
		super(x,y,vx,vy);
	}
	public void move() {
		super.move();
		if(x<0) x=0;
		if(x>370)x=370;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (e.getKeyCode()==KeyEvent.VK_A) {
			vx=-5;
		}
		if (e.getKeyCode()==KeyEvent.VK_D) {
			vx=5;
		}
		
	 }
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		if (e.getKeyCode()==KeyEvent.VK_A) {
			vx=0;
		}
		if (e.getKeyCode()==KeyEvent.VK_D) {
			vx=0;
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ

		if (e.getButton() == MouseEvent.BUTTON1) { // 左クリック
			GameWorld.playerBullets.add(new PlayerBullet(x, y, 0, -10));
			System.out.println("弾の数=" + GameWorld.playerBullets.size());
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		
	}
}
