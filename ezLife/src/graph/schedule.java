package graph;
import com.database.*;
import com.event.*;
import com.social.*;
import com.study.*;
import javax.swing.*;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class schedule extends JFrame implements ActionListener{
	JButton dueday = new JButton("dueday");
	JButton event = new JButton("events");
	JButton back = new JButton("back");
	static ImageIcon background;
	
	public schedule(){
		super("schedule");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,500);
		GridBagLayout g = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(g);
		
		background = new ImageIcon("back.jpg");
		JLabel label = new JLabel(background);
		label.setSize(background.getIconWidth(), background.getIconHeight());
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(label,new Integer(Integer.MIN_VALUE));
		JPanel imagePanel = (JPanel)this.getContentPane();
		imagePanel.setOpaque(false);
		
		c.gridx = 0;
		c.gridy = 0;
		add(dueday,c);
		c.gridx = 0;
		c.gridy = 2;
		dueday.setPreferredSize(new Dimension(300, 40));
		dueday.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					duetable s = new duetable();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
			}
        });
		add(event,c);
		c.gridx = 0;
		c.gridy = 4;
		event.setPreferredSize(new Dimension(300, 40));
		event.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				try {
					eventtable so = new eventtable();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setVisible(false);
			}
        });
		add(back,c);
		c.gridx = 0;
		c.gridy = 6;
		back.setPreferredSize(new Dimension(100, 40));
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				panel p = new panel();
				setVisible(false);
			}
        });
	
	setVisible(true);
}
	public void actionPerformed(ActionEvent e){
		
	}
	

}
