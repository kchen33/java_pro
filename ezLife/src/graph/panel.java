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
import java.io.IOException;

class panel extends JFrame implements ActionListener{
	JButton study = new JButton("study");
	JButton social = new JButton("social");
	JButton event = new JButton("event");
	JButton schedule = new JButton("schedule");
	JButton logout = new JButton("Logout");
	static ImageIcon background;
	
	public panel(){
		super("ezLife");
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
		add(study,c);
		c.gridx = 0;
		c.gridy = 2;
		study.setPreferredSize(new Dimension(300, 40));
		study.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				study s = new study();
				setVisible(false);
			}
        });
		add(social,c);
		c.gridx = 0;
		c.gridy = 4;
		social.setPreferredSize(new Dimension(300, 40));
		social.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				social so = new social();
				setVisible(false);
			}
        });
		add(event,c);
		c.gridx = 0;
		c.gridy = 6;
		add(event,c);
		event.setPreferredSize(new Dimension(300, 40));
		event.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				event e1 = new event();
				setVisible(false);
			}
        });
		setVisible(true);
	
	add(schedule,c);
	c.gridx = 0;
	c.gridy = 8;
	add(schedule,c);
	schedule.setPreferredSize(new Dimension(300, 40));
	schedule.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			schedule e1 = new schedule();
			setVisible(false);
		}
    });
	setVisible(true);
	
	add(logout,c);
	c.gridx = 0;
	c.gridy = 10;
	add(logout,c);
	logout.setPreferredSize(new Dimension(75, 30));
	logout.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			login l = new login();
			setVisible(false);
		}
    });
	setVisible(true);
}
	public void actionPerformed(ActionEvent e){
		
	}
	

}

