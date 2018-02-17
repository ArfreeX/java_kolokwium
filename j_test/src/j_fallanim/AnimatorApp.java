package j_fallanim;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnimatorApp extends JFrame {

	JFrame ramka;
	AnimPanel panel;
	public AnimatorApp() {
		ramka = new JFrame("Test");
		ramka.setBounds(100, 100, 640, 480);
		ramka.setVisible(true);
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setLayout(null);

		panel = new AnimPanel();
		panel.setBounds(10, 10, 600, 400);
		panel.setVisible(true);
		ramka.add(panel);
		panel.setBackground(Color.white);
		panel.setLayout(null);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimatorApp program = new AnimatorApp();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
