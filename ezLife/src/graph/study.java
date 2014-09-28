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

class study extends JFrame implements ActionListener{
	JButton due = new JButton("due date");
	JButton class1 = new JButton("course schedule");
	JButton back = new JButton("back");
	static ImageIcon background;
	
	public study(){
		super("study");
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
		add(due,c);
		c.gridx = 0;
		c.gridy = 2;
		due.setPreferredSize(new Dimension(300, 40));
		due.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				due_day due = new due_day();
			}
        });
		add(class1,c);
		c.gridx = 0;
		c.gridy = 4;
		class1.setPreferredSize(new Dimension(300, 40));
		class1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				class_ cl = new class_();
			}
        });
		add(back,c);
		c.gridx = 0;
		c.gridy = 6;
		add(back,c);
		back.setPreferredSize(new Dimension(80, 40));
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


