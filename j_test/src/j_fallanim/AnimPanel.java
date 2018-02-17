package j_fallanim;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.util.Timer;

import javax.swing.JPanel;

public class AnimPanel extends JPanel implements MouseListener, ActionListener {

	private boolean clickCounter = false;
	private Point2D dot1, dot2;
	private Timer timer;
	private int opoznienie = 70;

	public AnimPanel() {
		super();
		addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if (clickCounter) {
			dot2 = new Point2D.Double(arg0.getX(), arg0.getY());
			Figure object = new Figure(dot1, dot2);
			object.setVisible(true);
			add(object);
			new Thread(object).start();
			repaint();
			clickCounter = false;
		} else {
			dot1 = new Point2D.Double(arg0.getX(), arg0.getY());
			clickCounter = true;
		}

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
