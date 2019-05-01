package yetAnotherTestProject;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GPanel extends JPanel
{
	public void paint(Graphics g) {
		g.drawLine(0, 0, 300, 300);
		g.drawLine(200, 50, 100, 70);
	}
}