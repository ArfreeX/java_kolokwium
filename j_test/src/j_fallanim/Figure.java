package j_fallanim;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Figure extends JComponent implements Runnable {

	Point2D dot1, dot2;
	Rectangle2D prostokat;

	public Figure(Point2D dot1, Point2D dot2) {
		this.dot1 = dot1;
		this.dot2 = dot2;
		setSize(600, 400);
		repaint();
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		prostokat = new Rectangle2D.Double();
		prostokat.setFrameFromDiagonal(dot1, dot2);
		g2d.draw(prostokat);

	}

	protected double lowerPoint() {
		if (dot1.getY() > dot2.getY())
			return dot1.getY();
		else
			return dot2.getY();
	}

	@Override
	public void run() {
		while (lowerPoint() < 399) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				System.out.println("Blad");
				e.printStackTrace();
			}
			dot1 = new Point2D.Double(dot1.getX(), dot1.getY() + 1);
			dot2 = new Point2D.Double(dot2.getX(), dot2.getY() + 1);
			prostokat.setFrameFromDiagonal(dot1, dot2);  
			repaint();
		}
	}
}
