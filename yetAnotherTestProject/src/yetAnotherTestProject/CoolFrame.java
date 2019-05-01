package yetAnotherTestProject;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CoolFrame extends JFrame implements WindowListener, ActionListener
{
	
	JButton btn1;
	GPanel drawPanel;
	
	public CoolFrame() {
		super("Cool Graphics!!");
		drawPanel = new GPanel();
		btn1 = new JButton("KNAPPETT");
		GridBagConstraints c = new GridBagConstraints();
		
		setVisible(true);
		setSize(500, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		drawPanel.setBackground(Color.GRAY);
		drawPanel.setVisible(true);
		
		int in = 8;
		c.insets = new Insets(in, in, in, in);
		c.fill = GridBagConstraints.HORIZONTAL;
		
		c.ipadx = 300;
		c.ipady = 300;
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 3;
		add(drawPanel, c);
		
		c.ipadx = 0;
		c.ipady = 0;
		c.gridx = 0;
		c.gridy = 1;
		add(btn1, c);
		
		
		addWindowListener(this);
		btn1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		drawPanel.repaint();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void windowActivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e)
	{
		// TODO Auto-generated method stub
		
	}
}
